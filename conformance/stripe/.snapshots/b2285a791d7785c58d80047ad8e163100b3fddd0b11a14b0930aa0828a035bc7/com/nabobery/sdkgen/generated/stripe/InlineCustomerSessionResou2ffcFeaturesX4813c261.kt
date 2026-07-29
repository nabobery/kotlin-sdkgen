package com.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Set
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineCustomerSessionResou2ffcFeaturesX4813c261Branch {
  CustomerSessionResourceComponentsResourceMobilePaymentElementResourceFeatures,
}

public sealed class InlineCustomerSessionResou2ffcFeaturesX4813c261DecodingException(
  message: String,
) : SerializationException(message)

public class InlineCustomerSessionResou2ffcFeaturesX4813c261NoMatchException(
  message: String,
) : InlineCustomerSessionResou2ffcFeaturesX4813c261DecodingException(message)

internal data class InlineCustomerSessionResou2ffcFeaturesX4813c261Inspection(
  public val matchesCustomerSessionResourceComponentsResourceMobilePaymentElementResourceFeatures:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesCustomerSessionResourceComponentsResourceMobilePaymentElementResourceFeatures).count { it }
}

/**
 * This hash defines whether the mobile payment element supports certain features.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/customer_session_resource_components_resource_mobile_payment_element
 * /properties/features
 */
@Serializable(with = InlineCustomerSessionResou2ffcFeaturesX4813c261.Serializer::class)
public class InlineCustomerSessionResou2ffcFeaturesX4813c261 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineCustomerSessionResou2ffcFeaturesX4813c261Inspection,
) {
  public val customerSessionResourceComponentsResourceMobilePaymentElementResourceFeatures:
      CustomerSessionResourceComponentsResourceMobilePaymentElementResourceFeaturesView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesCustomerSessionResourceComponentsResourceMobilePaymentElementResourceFeatures) json.decodeFromJsonElement<CustomerSessionResourceComponentsResourceMobilePaymentElementResourceFeaturesView>(raw) else null }

  public val matchedBranches: Set<InlineCustomerSessionResou2ffcFeaturesX4813c261Branch>
    get() = buildSet {
      if (inspection.matchesCustomerSessionResourceComponentsResourceMobilePaymentElementResourceFeatures) add(InlineCustomerSessionResou2ffcFeaturesX4813c261Branch.CustomerSessionResourceComponentsResourceMobilePaymentElementResourceFeatures)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineCustomerSessionResou2ffcFeaturesX4813c261 {
      val inspection = inspectInlineCustomerSessionResou2ffcFeaturesX4813c261(raw)
      if (inspection.matchCount == 0) {
        throw InlineCustomerSessionResou2ffcFeaturesX4813c261NoMatchException("InlineCustomerSessionResou2ffcFeaturesX4813c261 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineCustomerSessionResou2ffcFeaturesX4813c261(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineCustomerSessionResou2ffcFeaturesX4813c261> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineCustomerSessionResou2ffcFeaturesX4813c261 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineCustomerSessionResou2ffcFeaturesX4813c261")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineCustomerSessionResou2ffcFeaturesX4813c261) {
      encoder.requireJsonEncoder("InlineCustomerSessionResou2ffcFeaturesX4813c261").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineCustomerSessionResou2ffcFeaturesX4813c261(element: JsonElement): InlineCustomerSessionResou2ffcFeaturesX4813c261Inspection {
  val raw = element as? JsonObject ?: return InlineCustomerSessionResou2ffcFeaturesX4813c261Inspection(
    matchesCustomerSessionResourceComponentsResourceMobilePaymentElementResourceFeatures = false,
    failures = listOf("CustomerSessionResourceComponentsResourceMobilePaymentElementResourceFeatures: expected JSON object"),
  )
  val matchesCustomerSessionResourceComponentsResourceMobilePaymentElementResourceFeatures = true
  return InlineCustomerSessionResou2ffcFeaturesX4813c261Inspection(
    matchesCustomerSessionResourceComponentsResourceMobilePaymentElementResourceFeatures = matchesCustomerSessionResourceComponentsResourceMobilePaymentElementResourceFeatures,
    failures = buildList {
      if (!matchesCustomerSessionResourceComponentsResourceMobilePaymentElementResourceFeatures) add("CustomerSessionResourceComponentsResourceMobilePaymentElementResourceFeatures: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
