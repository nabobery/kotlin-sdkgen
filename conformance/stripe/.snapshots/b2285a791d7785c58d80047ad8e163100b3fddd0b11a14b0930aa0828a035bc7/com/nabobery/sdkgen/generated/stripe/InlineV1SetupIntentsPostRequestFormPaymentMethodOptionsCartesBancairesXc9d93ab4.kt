package com.nabobery.sdkgen.generated.stripe

import kotlin.Int
import kotlin.String
import kotlin.Unit
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
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_method_options/properties/card/properties/three_d_secure/properties/network_options/properti
 * es/cartes_bancaires.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_method_options/properties/card/properties/three_d_secure/properties/network_options/properti
 * es/cartes_bancaires
 */
@Serializable(with = InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCartesBancairesXc9d93ab4.Serializer::class)
public class InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCartesBancairesXc9d93ab4(
  public val cbAvalgo: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCardCbAvalgoXa215cd6b,
  public val cbExemption: String? = null,
  public val cbScore: Int? = null,
) {
  public class Builder {
    private var cbAvalgoValue:
        InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCardCbAvalgoXa215cd6b? = null

    public var cbAvalgo:
        InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCardCbAvalgoXa215cd6b
      get() = requireNotNull(cbAvalgoValue) { "cbAvalgo is required" }
      set(`value`) {
        cbAvalgoValue = value
      }

    public var cbExemption: String? = null

    public var cbScore: Int? = null

    public fun build(): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCartesBancairesXc9d93ab4 {
      check(cbAvalgoValue != null) { "cbAvalgo is required" }
      return InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCartesBancairesXc9d93ab4(
        cbAvalgo = cbAvalgo,
        cbExemption = cbExemption,
        cbScore = cbScore,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCartesBancairesXc9d93ab4 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCartesBancairesXc9d93ab4> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCartesBancairesXc9d93ab4 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCartesBancairesXc9d93ab4")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCartesBancairesXc9d93ab4 must be a JSON object")
      val cbAvalgo = json.decodeRequired<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCardCbAvalgoXa215cd6b>(rawObject, "cb_avalgo")
      return InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCartesBancairesXc9d93ab4(
        cbAvalgo = cbAvalgo,
        cbExemption = rawObject["cb_exemption"]?.let { json.decodeFromJsonElement<String>(it) },
        cbScore = rawObject["cb_score"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCartesBancairesXc9d93ab4) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCartesBancairesXc9d93ab4")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("cb_avalgo", json.encodeToJsonElement(value.cbAvalgo))
        value.cbExemption?.let { put("cb_exemption", it) }
        value.cbScore?.let { put("cb_score", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCartesBancairesXc9d93ab4(block: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCartesBancairesXc9d93ab4.Builder.() -> Unit): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCartesBancairesXc9d93ab4 = InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCartesBancairesXc9d93ab4.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCartesBancairesXc9d93ab4 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
