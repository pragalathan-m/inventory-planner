package fk.retail.ip.requirement.internal.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


/**
 *
 * @author Pragalathan M
 */
@Entity
@Table(name = "FORECAST")
@XmlRootElement
@Getter
@Setter
@NoArgsConstructor

public class FsnForecast extends ReadOnlyEntity {

    @Column(name = "fsn", insertable = false, updatable = false)
    private String fsn;
    @Column(name = "warehouse", insertable = false, updatable = false)
    private String warehouse;
    @Column(name = "forecast", insertable = false, updatable = false)
    private String forecast;

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FsnForecast)) {
            return false;
        }
        FsnForecast other = (FsnForecast) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.flipkart.ip.db.entity.FsnForecast[ id=" + id + " ]";
    }
}
