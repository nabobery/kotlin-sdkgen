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

public enum class InlineIssuingCardholderIdDocumentBackX7c37f4b6Branch {
  Branch1,
  File,
}

public sealed class InlineIssuingCardholderIdDocumentBackX7c37f4b6DecodingException(
  message: String,
) : SerializationException(message)

public class InlineIssuingCardholderIdDocumentBackX7c37f4b6NoMatchException(
  message: String,
) : InlineIssuingCardholderIdDocumentBackX7c37f4b6DecodingException(message)

internal data class InlineIssuingCardholderIdDocumentBackX7c37f4b6Inspection(
  public val matchesBranch1: Boolean,
  public val matchesFile: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesFile).count { it }
}

/**
 * The back of a document returned by a [file upload](https://api.stripe.com#create_file) with a `purpose` value of
 * `identity_document`.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing_cardholder_id_document/properties/back
 */
@Serializable(with = InlineIssuingCardholderIdDocumentBackX7c37f4b6.Serializer::class)
public class InlineIssuingCardholderIdDocumentBackX7c37f4b6 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineIssuingCardholderIdDocumentBackX7c37f4b6Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val `file`: File? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesFile) json.decodeFromJsonElement<File>(raw) else null }

  public val matchedBranches: Set<InlineIssuingCardholderIdDocumentBackX7c37f4b6Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineIssuingCardholderIdDocumentBackX7c37f4b6Branch.Branch1)
      if (inspection.matchesFile) add(InlineIssuingCardholderIdDocumentBackX7c37f4b6Branch.File)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineIssuingCardholderIdDocumentBackX7c37f4b6 {
      val inspection = inspectInlineIssuingCardholderIdDocumentBackX7c37f4b6(raw)
      if (inspection.matchCount == 0) {
        throw InlineIssuingCardholderIdDocumentBackX7c37f4b6NoMatchException("InlineIssuingCardholderIdDocumentBackX7c37f4b6 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineIssuingCardholderIdDocumentBackX7c37f4b6(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineIssuingCardholderIdDocumentBackX7c37f4b6> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineIssuingCardholderIdDocumentBackX7c37f4b6 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineIssuingCardholderIdDocumentBackX7c37f4b6")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineIssuingCardholderIdDocumentBackX7c37f4b6) {
      encoder.requireJsonEncoder("InlineIssuingCardholderIdDocumentBackX7c37f4b6").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineIssuingCardholderIdDocumentBackX7c37f4b6(element: JsonElement): InlineIssuingCardholderIdDocumentBackX7c37f4b6Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesFile = element.isJsonDecodable<File>()
  return InlineIssuingCardholderIdDocumentBackX7c37f4b6Inspection(
    matchesBranch1 = matchesBranch1,
    matchesFile = matchesFile,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesFile) add("File: value does not match File")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
