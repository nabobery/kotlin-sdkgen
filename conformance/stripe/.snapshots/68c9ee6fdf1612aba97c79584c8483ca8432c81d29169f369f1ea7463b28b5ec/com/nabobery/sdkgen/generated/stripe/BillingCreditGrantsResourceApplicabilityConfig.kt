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
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/billing_credit_grants_resource_applicability_config
 */
@Serializable(with = BillingCreditGrantsResourceApplicabilityConfig.Serializer::class)
public class BillingCreditGrantsResourceApplicabilityConfig(
  public val scope: BillingCreditGrantsResourceScope,
) {
  public class Builder {
    private var scopeValue: BillingCreditGrantsResourceScope? = null

    public var scope: BillingCreditGrantsResourceScope
      get() = requireNotNull(scopeValue) { "scope is required" }
      set(`value`) {
        scopeValue = value
      }

    public fun build(): BillingCreditGrantsResourceApplicabilityConfig {
      check(scopeValue != null) { "scope is required" }
      return BillingCreditGrantsResourceApplicabilityConfig(
        scope = scope,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): BillingCreditGrantsResourceApplicabilityConfig = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<BillingCreditGrantsResourceApplicabilityConfig> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): BillingCreditGrantsResourceApplicabilityConfig {
      val jsonDecoder = decoder.requireJsonDecoder("BillingCreditGrantsResourceApplicabilityConfig")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("BillingCreditGrantsResourceApplicabilityConfig must be a JSON object")
      val scope = json.decodeRequired<BillingCreditGrantsResourceScope>(rawObject, "scope")
      return BillingCreditGrantsResourceApplicabilityConfig(
        scope = scope,
      )
    }

    override fun serialize(encoder: Encoder, `value`: BillingCreditGrantsResourceApplicabilityConfig) {
      val jsonEncoder = encoder.requireJsonEncoder("BillingCreditGrantsResourceApplicabilityConfig")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("scope", json.encodeToJsonElement(value.scope))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun billingCreditGrantsResourceApplicabilityConfig(block: BillingCreditGrantsResourceApplicabilityConfig.Builder.() -> Unit): BillingCreditGrantsResourceApplicabilityConfig = BillingCreditGrantsResourceApplicabilityConfig.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("BillingCreditGrantsResourceApplicabilityConfig is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
