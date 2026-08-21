package com.nabobery.sdkgen.generated.stripe

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
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1billing~1credit_grants/post/requestBody/content/application~1x-www-form-url
 * encoded/schema/properties/applicability_config/properties/scope/properties/prices/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1billing~1credit_grants/post/requestBody/content/application~1x-www-form-url
 * encoded/schema/properties/applicability_config/properties/scope/properties/prices/items
 */
@Serializable(with = InlineV1BillingCreditGrantsPostRequestFormApplicabilityConfigScopeItemXf9106dc8.Serializer::class)
public class InlineV1BillingCreditGrantsPostRequestFormApplicabilityConfigScopeItemXf9106dc8(
  public val id: String,
) {
  public class Builder {
    private var idValue: String? = null

    public var id: String
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    public fun build(): InlineV1BillingCreditGrantsPostRequestFormApplicabilityConfigScopeItemXf9106dc8 {
      check(idValue != null) { "id is required" }
      return InlineV1BillingCreditGrantsPostRequestFormApplicabilityConfigScopeItemXf9106dc8(
        id = id,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1BillingCreditGrantsPostRequestFormApplicabilityConfigScopeItemXf9106dc8 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1BillingCreditGrantsPostRequestFormApplicabilityConfigScopeItemXf9106dc8> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1BillingCreditGrantsPostRequestFormApplicabilityConfigScopeItemXf9106dc8 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1BillingCreditGrantsPostRequestFormApplicabilityConfigScopeItemXf9106dc8")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1BillingCreditGrantsPostRequestFormApplicabilityConfigScopeItemXf9106dc8 must be a JSON object")
      val id = json.decodeRequired<String>(rawObject, "id")
      return InlineV1BillingCreditGrantsPostRequestFormApplicabilityConfigScopeItemXf9106dc8(
        id = id,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1BillingCreditGrantsPostRequestFormApplicabilityConfigScopeItemXf9106dc8) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1BillingCreditGrantsPostRequestFormApplicabilityConfigScopeItemXf9106dc8")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("id", value.id)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1BillingCreditGrantsPostRequestFormApplicabilityConfigScopeItemXf9106dc8(block: InlineV1BillingCreditGrantsPostRequestFormApplicabilityConfigScopeItemXf9106dc8.Builder.() -> Unit): InlineV1BillingCreditGrantsPostRequestFormApplicabilityConfigScopeItemXf9106dc8 = InlineV1BillingCreditGrantsPostRequestFormApplicabilityConfigScopeItemXf9106dc8.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1BillingCreditGrantsPostRequestFormApplicabilityConfigScopeItemXf9106dc8 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
