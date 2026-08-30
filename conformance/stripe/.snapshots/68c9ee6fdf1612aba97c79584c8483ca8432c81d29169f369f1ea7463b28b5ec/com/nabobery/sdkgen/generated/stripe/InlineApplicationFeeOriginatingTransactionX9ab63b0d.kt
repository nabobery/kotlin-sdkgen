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
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineApplicationFeeOriginatingTransactionX9ab63b0dBranch {
  Branch1,
  Charge,
}

public sealed class InlineApplicationFeeOriginatingTransactionX9ab63b0dDecodingException(
  message: String,
) : SerializationException(message)

public class InlineApplicationFeeOriginatingTransactionX9ab63b0dNoMatchException(
  message: String,
) : InlineApplicationFeeOriginatingTransactionX9ab63b0dDecodingException(message)

internal data class InlineApplicationFeeOriginatingTransactionX9ab63b0dInspection(
  public val matchesBranch1: Boolean,
  public val matchesCharge: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesCharge).count { it }
}

/**
 * ID of the corresponding charge on the platform account, if this fee was the result of a charge using the
 * `destination` parameter.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/application_fee/properties/originating_transaction
 */
@Serializable(with = InlineApplicationFeeOriginatingTransactionX9ab63b0d.Serializer::class)
public class InlineApplicationFeeOriginatingTransactionX9ab63b0d internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineApplicationFeeOriginatingTransactionX9ab63b0dInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val charge: Charge? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesCharge) json.decodeFromJsonElement<Charge>(raw) else null }

  public val matchedBranches: Set<InlineApplicationFeeOriginatingTransactionX9ab63b0dBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineApplicationFeeOriginatingTransactionX9ab63b0dBranch.Branch1)
      if (inspection.matchesCharge) add(InlineApplicationFeeOriginatingTransactionX9ab63b0dBranch.Charge)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineApplicationFeeOriginatingTransactionX9ab63b0d {
      val inspection = inspectInlineApplicationFeeOriginatingTransactionX9ab63b0d(raw)
      if (inspection.matchCount == 0) {
        throw InlineApplicationFeeOriginatingTransactionX9ab63b0dNoMatchException("InlineApplicationFeeOriginatingTransactionX9ab63b0d matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineApplicationFeeOriginatingTransactionX9ab63b0d(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineApplicationFeeOriginatingTransactionX9ab63b0d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineApplicationFeeOriginatingTransactionX9ab63b0d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineApplicationFeeOriginatingTransactionX9ab63b0d")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineApplicationFeeOriginatingTransactionX9ab63b0d) {
      encoder.requireJsonEncoder("InlineApplicationFeeOriginatingTransactionX9ab63b0d").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineApplicationFeeOriginatingTransactionX9ab63b0d(element: JsonElement): InlineApplicationFeeOriginatingTransactionX9ab63b0dInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesCharge = element.isJsonDecodable<Charge>()
  return InlineApplicationFeeOriginatingTransactionX9ab63b0dInspection(
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
