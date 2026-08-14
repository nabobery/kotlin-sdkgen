package io.github.nabobery.sdkgen.generated.stripe

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
 * Configuration specifying what this credit grant applies to. We currently only support `metered` prices that have a
 * [Billing Meter](https://docs.stripe.com/api/billing/meter) attached to them.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1billing~1credit_grants/post/requestBody/content/application~1x-www-form-url
 * encoded/schema/properties/applicability_config
 */
@Serializable(with = InlineV1BillingCreditGrantsPostRequestFormApplicabilityConfigX8078051e.Serializer::class)
public class InlineV1BillingCreditGrantsPostRequestFormApplicabilityConfigX8078051e(
  public val scope: InlineV1BillingCreditGrantsPostRequestFormApplicabilityConfigScopeXdcc927f3,
) {
  public class Builder {
    private var scopeValue:
        InlineV1BillingCreditGrantsPostRequestFormApplicabilityConfigScopeXdcc927f3? = null

    public var scope: InlineV1BillingCreditGrantsPostRequestFormApplicabilityConfigScopeXdcc927f3
      get() = requireNotNull(scopeValue) { "scope is required" }
      set(`value`) {
        scopeValue = value
      }

    public fun build(): InlineV1BillingCreditGrantsPostRequestFormApplicabilityConfigX8078051e {
      check(scopeValue != null) { "scope is required" }
      return InlineV1BillingCreditGrantsPostRequestFormApplicabilityConfigX8078051e(
        scope = scope,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1BillingCreditGrantsPostRequestFormApplicabilityConfigX8078051e = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1BillingCreditGrantsPostRequestFormApplicabilityConfigX8078051e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1BillingCreditGrantsPostRequestFormApplicabilityConfigX8078051e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1BillingCreditGrantsPostRequestFormApplicabilityConfigX8078051e")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1BillingCreditGrantsPostRequestFormApplicabilityConfigX8078051e must be a JSON object")
      val scope = json.decodeRequired<InlineV1BillingCreditGrantsPostRequestFormApplicabilityConfigScopeXdcc927f3>(rawObject, "scope")
      return InlineV1BillingCreditGrantsPostRequestFormApplicabilityConfigX8078051e(
        scope = scope,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1BillingCreditGrantsPostRequestFormApplicabilityConfigX8078051e) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1BillingCreditGrantsPostRequestFormApplicabilityConfigX8078051e")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("scope", json.encodeToJsonElement(value.scope))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1BillingCreditGrantsPostRequestFormApplicabilityConfigX8078051e(block: InlineV1BillingCreditGrantsPostRequestFormApplicabilityConfigX8078051e.Builder.() -> Unit): InlineV1BillingCreditGrantsPostRequestFormApplicabilityConfigX8078051e = InlineV1BillingCreditGrantsPostRequestFormApplicabilityConfigX8078051e.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1BillingCreditGrantsPostRequestFormApplicabilityConfigX8078051e is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
