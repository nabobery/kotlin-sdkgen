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
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}~1confirm/post/requestBody/content/application~1x-ww
 * w-form-urlencoded/schema/properties/payment_method_options/properties/card/properties/three_d_secure/properties/netwo
 * rk_options/properties/cartes_bancaires.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}~1confirm/post/requestBody/content/application~1x-ww
 * w-form-urlencoded/schema/properties/payment_method_options/properties/card/properties/three_d_secure/properties/netwo
 * rk_options/properties/cartes_bancaires
 */
@Serializable(with = InlineV1SetupIntentsConfirmPostRequestFormCartesBancairesX7477efbe.Serializer::class)
public class InlineV1SetupIntentsConfirmPostRequestFormCartesBancairesX7477efbe(
  public val cbAvalgo:
      InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsCbAvalgoX39c9556b,
  public val cbExemption: String? = null,
  public val cbScore: Int? = null,
) {
  public class Builder {
    private var cbAvalgoValue:
        InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsCbAvalgoX39c9556b? = null

    public var cbAvalgo:
        InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsCbAvalgoX39c9556b
      get() = requireNotNull(cbAvalgoValue) { "cbAvalgo is required" }
      set(`value`) {
        cbAvalgoValue = value
      }

    public var cbExemption: String? = null

    public var cbScore: Int? = null

    public fun build(): InlineV1SetupIntentsConfirmPostRequestFormCartesBancairesX7477efbe {
      check(cbAvalgoValue != null) { "cbAvalgo is required" }
      return InlineV1SetupIntentsConfirmPostRequestFormCartesBancairesX7477efbe(
        cbAvalgo = cbAvalgo,
        cbExemption = cbExemption,
        cbScore = cbScore,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1SetupIntentsConfirmPostRequestFormCartesBancairesX7477efbe = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1SetupIntentsConfirmPostRequestFormCartesBancairesX7477efbe> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SetupIntentsConfirmPostRequestFormCartesBancairesX7477efbe {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SetupIntentsConfirmPostRequestFormCartesBancairesX7477efbe")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SetupIntentsConfirmPostRequestFormCartesBancairesX7477efbe must be a JSON object")
      val cbAvalgo = json.decodeRequired<InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsCbAvalgoX39c9556b>(rawObject, "cb_avalgo")
      return InlineV1SetupIntentsConfirmPostRequestFormCartesBancairesX7477efbe(
        cbAvalgo = cbAvalgo,
        cbExemption = rawObject["cb_exemption"]?.let { json.decodeFromJsonElement<String>(it) },
        cbScore = rawObject["cb_score"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SetupIntentsConfirmPostRequestFormCartesBancairesX7477efbe) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SetupIntentsConfirmPostRequestFormCartesBancairesX7477efbe")
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

public fun inlineV1SetupIntentsConfirmPostRequestFormCartesBancairesX7477efbe(block: InlineV1SetupIntentsConfirmPostRequestFormCartesBancairesX7477efbe.Builder.() -> Unit): InlineV1SetupIntentsConfirmPostRequestFormCartesBancairesX7477efbe = InlineV1SetupIntentsConfirmPostRequestFormCartesBancairesX7477efbe.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1SetupIntentsConfirmPostRequestFormCartesBancairesX7477efbe is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
