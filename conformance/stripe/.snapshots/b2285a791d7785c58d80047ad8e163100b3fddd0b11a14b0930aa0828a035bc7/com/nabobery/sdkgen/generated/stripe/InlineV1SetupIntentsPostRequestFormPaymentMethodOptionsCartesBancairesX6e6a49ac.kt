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
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}/post/requestBody/content/application~1x-www-form-ur
 * lencoded/schema/properties/payment_method_options/properties/card/properties/three_d_secure/properties/network_option
 * s/properties/cartes_bancaires.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}/post/requestBody/content/application~1x-www-form-ur
 * lencoded/schema/properties/payment_method_options/properties/card/properties/three_d_secure/properties/network_option
 * s/properties/cartes_bancaires
 */
@Serializable(with = InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCartesBancairesX6e6a49ac.Serializer::class)
public class InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCartesBancairesX6e6a49ac(
  public val cbAvalgo: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCardCbAvalgoX4f591f93,
  public val cbExemption: String? = null,
  public val cbScore: Int? = null,
) {
  public class Builder {
    private var cbAvalgoValue:
        InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCardCbAvalgoX4f591f93? = null

    public var cbAvalgo:
        InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCardCbAvalgoX4f591f93
      get() = requireNotNull(cbAvalgoValue) { "cbAvalgo is required" }
      set(`value`) {
        cbAvalgoValue = value
      }

    public var cbExemption: String? = null

    public var cbScore: Int? = null

    public fun build(): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCartesBancairesX6e6a49ac {
      check(cbAvalgoValue != null) { "cbAvalgo is required" }
      return InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCartesBancairesX6e6a49ac(
        cbAvalgo = cbAvalgo,
        cbExemption = cbExemption,
        cbScore = cbScore,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCartesBancairesX6e6a49ac = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCartesBancairesX6e6a49ac> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCartesBancairesX6e6a49ac {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCartesBancairesX6e6a49ac")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCartesBancairesX6e6a49ac must be a JSON object")
      val cbAvalgo = json.decodeRequired<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCardCbAvalgoX4f591f93>(rawObject, "cb_avalgo")
      return InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCartesBancairesX6e6a49ac(
        cbAvalgo = cbAvalgo,
        cbExemption = rawObject["cb_exemption"]?.let { json.decodeFromJsonElement<String>(it) },
        cbScore = rawObject["cb_score"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCartesBancairesX6e6a49ac) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCartesBancairesX6e6a49ac")
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

public fun inlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCartesBancairesX6e6a49ac(block: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCartesBancairesX6e6a49ac.Builder.() -> Unit): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCartesBancairesX6e6a49ac = InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCartesBancairesX6e6a49ac.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCartesBancairesX6e6a49ac is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
