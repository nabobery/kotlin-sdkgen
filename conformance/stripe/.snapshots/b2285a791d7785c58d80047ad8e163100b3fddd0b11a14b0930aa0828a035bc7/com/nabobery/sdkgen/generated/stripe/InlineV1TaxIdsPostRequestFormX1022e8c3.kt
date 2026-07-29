package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1tax_ids/post/requestBody/content/application~1x-www-form-urlencoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tax_ids/post/requestBody/content/application~1x-www-form-urlencoded/schema
 */
@Serializable(with = InlineV1TaxIdsPostRequestFormX1022e8c3.Serializer::class)
public class InlineV1TaxIdsPostRequestFormX1022e8c3(
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
   * `ug_tin`, `us_ein`, `uy_ruc`, `uz_tin`, `uz_vat`, `ve_rif`, `vn_tin`, `za_vat`, `zm_tin`, or `zw_tin`
   */
  public val type: InlineV1TaxIdsPostRequestFormTypeX5cbe59b7,
  /**
   * Value of the tax ID.
   */
  public val `value`: String,
  expand: List<String>? = null,
  /**
   * The account or customer the tax ID belongs to. Defaults to `owner[type]=self`.
   */
  public val owner: InlineV1TaxIdsPostRequestFormOwnerXb78c8ac1? = null,
) {
  /**
   * Specifies which fields in the response should be expanded.
   */
  public val expand: List<String>? = expand?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var typeValue: InlineV1TaxIdsPostRequestFormTypeX5cbe59b7? = null

    public var type: InlineV1TaxIdsPostRequestFormTypeX5cbe59b7
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

    private var expandValue: List<String>? = null

    /**
     * Specifies which fields in the response should be expanded.
     */
    public var expand: List<String>?
      get() = expandValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        expandValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * The account or customer the tax ID belongs to. Defaults to `owner[type]=self`.
     */
    public var owner: InlineV1TaxIdsPostRequestFormOwnerXb78c8ac1? = null

    public fun build(): InlineV1TaxIdsPostRequestFormX1022e8c3 {
      check(typeValue != null) { "type is required" }
      check(valueValue != null) { "value is required" }
      return InlineV1TaxIdsPostRequestFormX1022e8c3(
        type = type,
        value = value,
        expand = expand,
        owner = owner,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TaxIdsPostRequestFormX1022e8c3 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1TaxIdsPostRequestFormX1022e8c3> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TaxIdsPostRequestFormX1022e8c3 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TaxIdsPostRequestFormX1022e8c3")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TaxIdsPostRequestFormX1022e8c3 must be a JSON object")
      val type = json.decodeRequired<InlineV1TaxIdsPostRequestFormTypeX5cbe59b7>(rawObject, "type")
      val value = json.decodeRequired<String>(rawObject, "value")
      return InlineV1TaxIdsPostRequestFormX1022e8c3(
        type = type,
        value = value,
        expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        owner = rawObject["owner"]?.let { json.decodeFromJsonElement<InlineV1TaxIdsPostRequestFormOwnerXb78c8ac1>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TaxIdsPostRequestFormX1022e8c3) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TaxIdsPostRequestFormX1022e8c3")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        put("value", value.value)
        value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
        value.owner?.let { put("owner", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TaxIdsPostRequestFormX1022e8c3(block: InlineV1TaxIdsPostRequestFormX1022e8c3.Builder.() -> Unit): InlineV1TaxIdsPostRequestFormX1022e8c3 = InlineV1TaxIdsPostRequestFormX1022e8c3.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1TaxIdsPostRequestFormX1022e8c3 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
