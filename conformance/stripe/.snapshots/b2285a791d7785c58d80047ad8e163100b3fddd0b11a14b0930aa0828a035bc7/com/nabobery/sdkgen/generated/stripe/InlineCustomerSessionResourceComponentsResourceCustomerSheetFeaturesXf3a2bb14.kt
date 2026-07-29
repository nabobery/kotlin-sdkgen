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

public enum class InlineCustomerSessionResourceComponentsResourceCustomerSheetFeaturesXf3a2bb14Branch {
  CustomerSessionResourceComponentsResourceCustomerSheetResourceFeatures,
}

public sealed class InlineCustomerSessionResourceComponentsResourceCustomerSheetFeaturesXf3a2bb14DecodingException(
  message: String,
) : SerializationException(message)

public class InlineCustomerSessionResourceComponentsResourceCustomerSheetFeaturesXf3a2bb14NoMatchException(
  message: String,
) : InlineCustomerSessionResourceComponentsResourceCustomerSheetFeaturesXf3a2bb14DecodingException(message)

internal data class InlineCustomerSessionResourceComponentsResourceCustomerSheetFeaturesXf3a2bb14Inspection(
  public val matchesCustomerSessionResourceComponentsResourceCustomerSheetResourceFeatures: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesCustomerSessionResourceComponentsResourceCustomerSheetResourceFeatures).count { it }
}

/**
 * This hash defines whether the customer sheet supports certain features.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/customer_session_resource_components_resource_customer_sheet/propert
 * ies/features
 */
@Serializable(with = InlineCustomerSessionResourceComponentsResourceCustomerSheetFeaturesXf3a2bb14.Serializer::class)
public class InlineCustomerSessionResourceComponentsResourceCustomerSheetFeaturesXf3a2bb14 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineCustomerSessionResourceComponentsResourceCustomerSheetFeaturesXf3a2bb14Inspection,
) {
  public val customerSessionResourceComponentsResourceCustomerSheetResourceFeatures:
      CustomerSessionResourceComponentsResourceCustomerSheetResourceFeaturesView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesCustomerSessionResourceComponentsResourceCustomerSheetResourceFeatures) json.decodeFromJsonElement<CustomerSessionResourceComponentsResourceCustomerSheetResourceFeaturesView>(raw) else null }

  public val matchedBranches:
      Set<InlineCustomerSessionResourceComponentsResourceCustomerSheetFeaturesXf3a2bb14Branch>
    get() = buildSet {
      if (inspection.matchesCustomerSessionResourceComponentsResourceCustomerSheetResourceFeatures) add(InlineCustomerSessionResourceComponentsResourceCustomerSheetFeaturesXf3a2bb14Branch.CustomerSessionResourceComponentsResourceCustomerSheetResourceFeatures)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineCustomerSessionResourceComponentsResourceCustomerSheetFeaturesXf3a2bb14 {
      val inspection = inspectInlineCustomerSessionResourceComponentsResourceCustomerSheetFeaturesXf3a2bb14(raw)
      if (inspection.matchCount == 0) {
        throw InlineCustomerSessionResourceComponentsResourceCustomerSheetFeaturesXf3a2bb14NoMatchException("InlineCustomerSessionResourceComponentsResourceCustomerSheetFeaturesXf3a2bb14 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineCustomerSessionResourceComponentsResourceCustomerSheetFeaturesXf3a2bb14(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineCustomerSessionResourceComponentsResourceCustomerSheetFeaturesXf3a2bb14> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineCustomerSessionResourceComponentsResourceCustomerSheetFeaturesXf3a2bb14 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineCustomerSessionResourceComponentsResourceCustomerSheetFeaturesXf3a2bb14")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineCustomerSessionResourceComponentsResourceCustomerSheetFeaturesXf3a2bb14) {
      encoder.requireJsonEncoder("InlineCustomerSessionResourceComponentsResourceCustomerSheetFeaturesXf3a2bb14").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineCustomerSessionResourceComponentsResourceCustomerSheetFeaturesXf3a2bb14(element: JsonElement): InlineCustomerSessionResourceComponentsResourceCustomerSheetFeaturesXf3a2bb14Inspection {
  val raw = element as? JsonObject ?: return InlineCustomerSessionResourceComponentsResourceCustomerSheetFeaturesXf3a2bb14Inspection(
    matchesCustomerSessionResourceComponentsResourceCustomerSheetResourceFeatures = false,
    failures = listOf("CustomerSessionResourceComponentsResourceCustomerSheetResourceFeatures: expected JSON object"),
  )
  val matchesCustomerSessionResourceComponentsResourceCustomerSheetResourceFeatures = true
  return InlineCustomerSessionResourceComponentsResourceCustomerSheetFeaturesXf3a2bb14Inspection(
    matchesCustomerSessionResourceComponentsResourceCustomerSheetResourceFeatures = matchesCustomerSessionResourceComponentsResourceCustomerSheetResourceFeatures,
    failures = buildList {
      if (!matchesCustomerSessionResourceComponentsResourceCustomerSheetResourceFeatures) add("CustomerSessionResourceComponentsResourceCustomerSheetResourceFeatures: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
