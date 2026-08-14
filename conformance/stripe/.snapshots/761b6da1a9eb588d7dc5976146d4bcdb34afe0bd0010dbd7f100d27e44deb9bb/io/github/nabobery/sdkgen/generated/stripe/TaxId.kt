package io.github.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

@Serializable
public data class TaxIdView(
  public val country: String? = null,
  public val created: Int,
  public val customer: InlineTaxIdCustomerXabeb847c? = null,
  @SerialName("customer_account")
  public val customerAccount: String? = null,
  public val id: String,
  public val livemode: Boolean,
  @SerialName("object")
  public val objectValue: InlineTaxIdObjectValueX106a7a77,
  public val owner: InlineTaxIdOwnerXad3865dd? = null,
  public val type: InlineTaxIdTypeXedc5a607,
  public val `value`: String,
  public val verification: InlineTaxIdVerificationX8fc6b9d2? = null,
)

/**
 * You can add one or multiple tax IDs to a [customer](https://docs.stripe.com/api/customers) or account.
 * Customer and account tax IDs get displayed on related invoices and credit notes.
 *
 * Related guides: [Customer tax identification numbers](https://docs.stripe.com/billing/taxes/tax-ids), [Account tax
 * IDs](https://docs.stripe.com/invoicing/connect#account-tax-ids)
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/tax_id
 */
@Serializable(with = TaxId.Serializer::class)
public class TaxId(
  /**
   * Time at which the object was created. Measured in seconds since the Unix epoch.
   */
  public val created: Int,
  /**
   * Unique identifier for the object.
   */
  public val id: String,
  /**
   * If the object exists in live mode, the value is `true`. If the object exists in test mode, the value is `false`.
   */
  public val livemode: Boolean,
  /**
   * String representing the object's type. Objects of the same type share the same value.
   */
  public val objectValue: InlineTaxIdObjectValueX106a7a77,
  /**
   * Type of the tax ID, one of `ad_nrt`, `ae_trn`, `al_tin`, `am_tin`, `ao_tin`, `ar_cuit`, `au_abn`, `au_arn`,
   * `aw_tin`, `az_tin`, `ba_tin`, `bb_tin`, `bd_bin`, `bf_ifu`, `bg_uic`, `bh_vat`, `bj_ifu`, `bo_tin`, `br_cnpj`,
   * `br_cpf`, `bs_tin`, `by_tin`, `ca_bn`, `ca_gst_hst`, `ca_pst_bc`, `ca_pst_mb`, `ca_pst_sk`, `ca_qst`, `cd_nif`,
   * `ch_uid`, `ch_vat`, `cl_tin`, `cm_niu`, `cn_tin`, `co_nit`, `cr_tin`, `cv_nif`, `de_stn`, `do_rcn`, `ec_ruc`,
   * `eg_tin`, `es_cif`, `et_tin`, `eu_oss_vat`, `eu_vat`, `fo_vat`, `gb_vat`, `ge_vat`, `gi_tin`, `gn_nif`, `hk_br`,
   * `hr_oib`, `hu_tin`, `id_npwp`, `il_vat`, `in_gst`, `is_vat`, `it_cf`, `jp_cn`, `jp_rn`, `jp_trn`, `ke_pin`,
   * `kg_tin`, `kh_tin`, `kr_brn`, `kz_bin`, `la_tin`, `li_uid`, `li_vat`, `lk_vat`, `ma_vat`, `md_vat`, `me_pib`,
   * `mk_vat`, `mr_nif`, `mx_rfc`, `my_frp`, `my_itn`, `my_sst`, `ng_tin`, `no_vat`, `no_voec`, `np_pan`, `nz_gst`,
   * `om_vat`, `pe_ruc`, `ph_tin`, `pl_nip`, `py_ruc`, `ro_tin`, `rs_pib`, `ru_inn`, `ru_kpp`, `sa_vat`, `sg_gst`,
   * `sg_uen`, `si_tin`, `sn_ninea`, `sr_fin`, `sv_nit`, `th_vat`, `tj_tin`, `tr_tin`, `tw_vat`, `tz_vat`, `ua_vat`,
   * `ug_tin`, `us_ein`, `uy_ruc`, `uz_tin`, `uz_vat`, `ve_rif`, `vn_tin`, `za_vat`, `zm_tin`, or `zw_tin`. Note that
   * some legacy tax IDs have type `unknown`
   */
  public val type: InlineTaxIdTypeXedc5a607,
  /**
   * Value of the tax ID.
   */
  public val `value`: String,
  /**
   * Two-letter ISO code representing the country of the tax ID.
   */
  public val country: String? = null,
  /**
   * ID of the customer.
   */
  public val customer: InlineTaxIdCustomerXabeb847c? = null,
  /**
   * ID of the Account representing the customer.
   */
  public val customerAccount: String? = null,
  /**
   * The account or customer the tax ID belongs to.
   */
  public val owner: InlineTaxIdOwnerXad3865dd? = null,
  /**
   * Tax ID verification information.
   */
  public val verification: InlineTaxIdVerificationX8fc6b9d2? = null,
) {
  public class Builder {
    private var createdValue: Int? = null

    public var created: Int
      get() = requireNotNull(createdValue) { "created is required" }
      set(`value`) {
        createdValue = value
      }

    private var idValue: String? = null

    public var id: String
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var livemodeValue: Boolean? = null

    public var livemode: Boolean
      get() = requireNotNull(livemodeValue) { "livemode is required" }
      set(`value`) {
        livemodeValue = value
      }

    private var objectValueValue: InlineTaxIdObjectValueX106a7a77? = null

    public var objectValue: InlineTaxIdObjectValueX106a7a77
      get() = requireNotNull(objectValueValue) { "objectValue is required" }
      set(`value`) {
        objectValueValue = value
      }

    private var typeValue: InlineTaxIdTypeXedc5a607? = null

    public var type: InlineTaxIdTypeXedc5a607
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    private var valueValue: String? = null

    public var `value`: String
      get() = requireNotNull(valueValue) { "value is required" }
      set(`value`) {
        valueValue = value
      }

    /**
     * Two-letter ISO code representing the country of the tax ID.
     */
    public var country: String? = null

    /**
     * ID of the customer.
     */
    public var customer: InlineTaxIdCustomerXabeb847c? = null

    /**
     * ID of the Account representing the customer.
     */
    public var customerAccount: String? = null

    /**
     * The account or customer the tax ID belongs to.
     */
    public var owner: InlineTaxIdOwnerXad3865dd? = null

    /**
     * Tax ID verification information.
     */
    public var verification: InlineTaxIdVerificationX8fc6b9d2? = null

    public fun build(): TaxId {
      check(createdValue != null) { "created is required" }
      check(idValue != null) { "id is required" }
      check(livemodeValue != null) { "livemode is required" }
      check(objectValueValue != null) { "objectValue is required" }
      check(typeValue != null) { "type is required" }
      check(valueValue != null) { "value is required" }
      return TaxId(
        created = created,
        id = id,
        livemode = livemode,
        objectValue = objectValue,
        type = type,
        value = value,
        country = country,
        customer = customer,
        customerAccount = customerAccount,
        owner = owner,
        verification = verification,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): TaxId = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<TaxId> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): TaxId {
      val jsonDecoder = decoder.requireJsonDecoder("TaxId")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("TaxId must be a JSON object")
      val created = json.decodeRequired<Int>(rawObject, "created")
      val id = json.decodeRequired<String>(rawObject, "id")
      val livemode = json.decodeRequired<Boolean>(rawObject, "livemode")
      val objectValue = json.decodeRequired<InlineTaxIdObjectValueX106a7a77>(rawObject, "object")
      val type = json.decodeRequired<InlineTaxIdTypeXedc5a607>(rawObject, "type")
      val value = json.decodeRequired<String>(rawObject, "value")
      return TaxId(
        created = created,
        id = id,
        livemode = livemode,
        objectValue = objectValue,
        type = type,
        value = value,
        country = rawObject["country"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        customer = rawObject["customer"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineTaxIdCustomerXabeb847c?>(element) },
        customerAccount = rawObject["customer_account"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        owner = rawObject["owner"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineTaxIdOwnerXad3865dd?>(element) },
        verification = rawObject["verification"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineTaxIdVerificationX8fc6b9d2?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: TaxId) {
      val jsonEncoder = encoder.requireJsonEncoder("TaxId")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("created", json.encodeToJsonElement(value.created))
        put("id", value.id)
        put("livemode", json.encodeToJsonElement(value.livemode))
        put("object", json.encodeToJsonElement(value.objectValue))
        put("type", json.encodeToJsonElement(value.type))
        put("value", value.value)
        value.country?.let { put("country", it) }
        value.customer?.let { put("customer", json.encodeToJsonElement(it)) }
        value.customerAccount?.let { put("customer_account", it) }
        value.owner?.let { put("owner", json.encodeToJsonElement(it)) }
        value.verification?.let { put("verification", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun taxId(block: TaxId.Builder.() -> Unit): TaxId = TaxId.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("TaxId is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
