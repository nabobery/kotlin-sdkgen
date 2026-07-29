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
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1tax_ids/post/requestBody/content/application~1x-www-
 * form-urlencoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1tax_ids/post/requestBody/content/application~1x-www-
 * form-urlencoded/schema
 */
@Serializable(with = InlineV1CustomersTaxIdsPostRequestFormX03c5a0dc.Serializer::class)
public class InlineV1CustomersTaxIdsPostRequestFormX03c5a0dc(
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
  public val type: InlineV1CustomersTaxIdsPostRequestFormTypeX5a57119d,
  /**
   * Value of the tax ID.
   */
  public val `value`: String,
  expand: List<String>? = null,
) {
  /**
   * Specifies which fields in the response should be expanded.
   */
  public val expand: List<String>? = expand?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var typeValue: InlineV1CustomersTaxIdsPostRequestFormTypeX5a57119d? = null

    public var type: InlineV1CustomersTaxIdsPostRequestFormTypeX5a57119d
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

    public fun build(): InlineV1CustomersTaxIdsPostRequestFormX03c5a0dc {
      check(typeValue != null) { "type is required" }
      check(valueValue != null) { "value is required" }
      return InlineV1CustomersTaxIdsPostRequestFormX03c5a0dc(
        type = type,
        value = value,
        expand = expand,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1CustomersTaxIdsPostRequestFormX03c5a0dc = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1CustomersTaxIdsPostRequestFormX03c5a0dc> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CustomersTaxIdsPostRequestFormX03c5a0dc {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CustomersTaxIdsPostRequestFormX03c5a0dc")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CustomersTaxIdsPostRequestFormX03c5a0dc must be a JSON object")
      val type = json.decodeRequired<InlineV1CustomersTaxIdsPostRequestFormTypeX5a57119d>(rawObject, "type")
      val value = json.decodeRequired<String>(rawObject, "value")
      return InlineV1CustomersTaxIdsPostRequestFormX03c5a0dc(
        type = type,
        value = value,
        expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomersTaxIdsPostRequestFormX03c5a0dc) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CustomersTaxIdsPostRequestFormX03c5a0dc")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        put("value", value.value)
        value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1CustomersTaxIdsPostRequestFormX03c5a0dc(block: InlineV1CustomersTaxIdsPostRequestFormX03c5a0dc.Builder.() -> Unit): InlineV1CustomersTaxIdsPostRequestFormX03c5a0dc = InlineV1CustomersTaxIdsPostRequestFormX03c5a0dc.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1CustomersTaxIdsPostRequestFormX03c5a0dc is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
