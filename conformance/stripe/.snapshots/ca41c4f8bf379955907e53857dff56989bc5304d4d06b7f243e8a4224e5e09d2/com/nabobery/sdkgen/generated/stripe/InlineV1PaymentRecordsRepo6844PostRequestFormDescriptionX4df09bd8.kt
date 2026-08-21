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

public enum class InlineV1PaymentRecordsRepo6844PostRequestFormDescriptionX4df09bd8Branch {
  Branch1,
  InlineV1PaymentRecordsRepo6844PostRequestFormDescriptionAnyOf2X9342c259,
}

public sealed class InlineV1PaymentRecordsRepo6844PostRequestFormDescriptionX4df09bd8DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentRecordsRepo6844PostRequestFormDescriptionX4df09bd8NoMatchException(
  message: String,
) : InlineV1PaymentRecordsRepo6844PostRequestFormDescriptionX4df09bd8DecodingException(message)

internal data class InlineV1PaymentRecordsRepo6844PostRequestFormDescriptionX4df09bd8Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1PaymentRecordsRepo6844PostRequestFormDescriptionAnyOf2X9342c259:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1PaymentRecordsRepo6844PostRequestFormDescriptionAnyOf2X9342c259).count { it }
}

/**
 * An arbitrary string attached to the object. Often useful for displaying to users.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_records~1{id}~1report_payment_attempt_informational/post/requestBod
 * y/content/application~1x-www-form-urlencoded/schema/properties/description
 */
@Serializable(with = InlineV1PaymentRecordsRepo6844PostRequestFormDescriptionX4df09bd8.Serializer::class)
public class InlineV1PaymentRecordsRepo6844PostRequestFormDescriptionX4df09bd8 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentRecordsRepo6844PostRequestFormDescriptionX4df09bd8Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1PaymentRecordsRepo6844PostRequestFormDescriptionAnyOf2X9342c259:
      InlineV1PaymentRecordsRepo6844PostRequestFormDescriptionAnyOf2X9342c259? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentRecordsRepo6844PostRequestFormDescriptionAnyOf2X9342c259) json.decodeFromJsonElement<InlineV1PaymentRecordsRepo6844PostRequestFormDescriptionAnyOf2X9342c259>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentRecordsRepo6844PostRequestFormDescriptionX4df09bd8Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1PaymentRecordsRepo6844PostRequestFormDescriptionX4df09bd8Branch.Branch1)
      if (inspection.matchesInlineV1PaymentRecordsRepo6844PostRequestFormDescriptionAnyOf2X9342c259) add(InlineV1PaymentRecordsRepo6844PostRequestFormDescriptionX4df09bd8Branch.InlineV1PaymentRecordsRepo6844PostRequestFormDescriptionAnyOf2X9342c259)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentRecordsRepo6844PostRequestFormDescriptionX4df09bd8 {
      val inspection = inspectInlineV1PaymentRecordsRepo6844PostRequestFormDescriptionX4df09bd8(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentRecordsRepo6844PostRequestFormDescriptionX4df09bd8NoMatchException("InlineV1PaymentRecordsRepo6844PostRequestFormDescriptionX4df09bd8 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentRecordsRepo6844PostRequestFormDescriptionX4df09bd8(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentRecordsRepo6844PostRequestFormDescriptionX4df09bd8> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentRecordsRepo6844PostRequestFormDescriptionX4df09bd8 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentRecordsRepo6844PostRequestFormDescriptionX4df09bd8")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentRecordsRepo6844PostRequestFormDescriptionX4df09bd8) {
      encoder.requireJsonEncoder("InlineV1PaymentRecordsRepo6844PostRequestFormDescriptionX4df09bd8").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentRecordsRepo6844PostRequestFormDescriptionX4df09bd8(element: JsonElement): InlineV1PaymentRecordsRepo6844PostRequestFormDescriptionX4df09bd8Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1PaymentRecordsRepo6844PostRequestFormDescriptionAnyOf2X9342c259 = element.isJsonDecodable<InlineV1PaymentRecordsRepo6844PostRequestFormDescriptionAnyOf2X9342c259>()
  return InlineV1PaymentRecordsRepo6844PostRequestFormDescriptionX4df09bd8Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1PaymentRecordsRepo6844PostRequestFormDescriptionAnyOf2X9342c259 = matchesInlineV1PaymentRecordsRepo6844PostRequestFormDescriptionAnyOf2X9342c259,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1PaymentRecordsRepo6844PostRequestFormDescriptionAnyOf2X9342c259) add("InlineV1PaymentRecordsRepo6844PostRequestFormDescriptionAnyOf2X9342c259: value does not match InlineV1PaymentRecordsRepo6844PostRequestFormDescriptionAnyOf2X9342c259")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
