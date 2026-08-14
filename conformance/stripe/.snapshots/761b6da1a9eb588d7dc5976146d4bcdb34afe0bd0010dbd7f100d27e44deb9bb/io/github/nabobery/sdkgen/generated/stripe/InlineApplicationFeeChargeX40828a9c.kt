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
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineApplicationFeeChargeX40828a9cBranch {
  Branch1,
  Charge,
}

public sealed class InlineApplicationFeeChargeX40828a9cDecodingException(
  message: String,
) : SerializationException(message)

public class InlineApplicationFeeChargeX40828a9cNoMatchException(
  message: String,
) : InlineApplicationFeeChargeX40828a9cDecodingException(message)

internal data class InlineApplicationFeeChargeX40828a9cInspection(
  public val matchesBranch1: Boolean,
  public val matchesCharge: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesCharge).count { it }
}

/**
 * ID of the charge that the application fee was taken from.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/application_fee/properties/charge
 */
@Serializable(with = InlineApplicationFeeChargeX40828a9c.Serializer::class)
public class InlineApplicationFeeChargeX40828a9c internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineApplicationFeeChargeX40828a9cInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val charge: Charge? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesCharge) json.decodeFromJsonElement<Charge>(raw) else null }

  public val matchedBranches: Set<InlineApplicationFeeChargeX40828a9cBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineApplicationFeeChargeX40828a9cBranch.Branch1)
      if (inspection.matchesCharge) add(InlineApplicationFeeChargeX40828a9cBranch.Charge)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineApplicationFeeChargeX40828a9c {
      val inspection = inspectInlineApplicationFeeChargeX40828a9c(raw)
      if (inspection.matchCount == 0) {
        throw InlineApplicationFeeChargeX40828a9cNoMatchException("InlineApplicationFeeChargeX40828a9c matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineApplicationFeeChargeX40828a9c(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineApplicationFeeChargeX40828a9c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineApplicationFeeChargeX40828a9c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineApplicationFeeChargeX40828a9c")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineApplicationFeeChargeX40828a9c) {
      encoder.requireJsonEncoder("InlineApplicationFeeChargeX40828a9c").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineApplicationFeeChargeX40828a9c(element: JsonElement): InlineApplicationFeeChargeX40828a9cInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesCharge = element.isJsonDecodable<Charge>()
  return InlineApplicationFeeChargeX40828a9cInspection(
    matchesBranch1 = matchesBranch1,
    matchesCharge = matchesCharge,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesCharge) add("Charge: value does not match Charge")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
