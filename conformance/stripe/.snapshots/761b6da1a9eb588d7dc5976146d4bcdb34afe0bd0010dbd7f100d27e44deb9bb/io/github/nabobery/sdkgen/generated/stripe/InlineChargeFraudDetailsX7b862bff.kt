package io.github.nabobery.sdkgen.generated.stripe

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

public enum class InlineChargeFraudDetailsX7b862bffBranch {
  ChargeFraudDetails,
}

public sealed class InlineChargeFraudDetailsX7b862bffDecodingException(
  message: String,
) : SerializationException(message)

public class InlineChargeFraudDetailsX7b862bffNoMatchException(
  message: String,
) : InlineChargeFraudDetailsX7b862bffDecodingException(message)

internal data class InlineChargeFraudDetailsX7b862bffInspection(
  public val matchesChargeFraudDetails: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesChargeFraudDetails).count { it }
}

/**
 * Information on fraud assessments for the charge.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/charge/properties/fraud_details
 */
@Serializable(with = InlineChargeFraudDetailsX7b862bff.Serializer::class)
public class InlineChargeFraudDetailsX7b862bff internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineChargeFraudDetailsX7b862bffInspection,
) {
  public val chargeFraudDetails: ChargeFraudDetailsView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesChargeFraudDetails) json.decodeFromJsonElement<ChargeFraudDetailsView>(raw) else null }

  public val matchedBranches: Set<InlineChargeFraudDetailsX7b862bffBranch>
    get() = buildSet {
      if (inspection.matchesChargeFraudDetails) add(InlineChargeFraudDetailsX7b862bffBranch.ChargeFraudDetails)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineChargeFraudDetailsX7b862bff {
      val inspection = inspectInlineChargeFraudDetailsX7b862bff(raw)
      if (inspection.matchCount == 0) {
        throw InlineChargeFraudDetailsX7b862bffNoMatchException("InlineChargeFraudDetailsX7b862bff matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineChargeFraudDetailsX7b862bff(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineChargeFraudDetailsX7b862bff> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineChargeFraudDetailsX7b862bff {
      val jsonDecoder = decoder.requireJsonDecoder("InlineChargeFraudDetailsX7b862bff")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineChargeFraudDetailsX7b862bff) {
      encoder.requireJsonEncoder("InlineChargeFraudDetailsX7b862bff").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineChargeFraudDetailsX7b862bff(element: JsonElement): InlineChargeFraudDetailsX7b862bffInspection {
  val raw = element as? JsonObject ?: return InlineChargeFraudDetailsX7b862bffInspection(
    matchesChargeFraudDetails = false,
    failures = listOf("ChargeFraudDetails: expected JSON object"),
  )
  val matchesChargeFraudDetails = true
  return InlineChargeFraudDetailsX7b862bffInspection(
    matchesChargeFraudDetails = matchesChargeFraudDetails,
    failures = buildList {
      if (!matchesChargeFraudDetails) add("ChargeFraudDetails: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
