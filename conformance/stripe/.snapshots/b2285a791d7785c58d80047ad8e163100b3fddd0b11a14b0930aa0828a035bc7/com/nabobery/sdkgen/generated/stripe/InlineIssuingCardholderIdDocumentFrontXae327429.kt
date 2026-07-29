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

public enum class InlineIssuingCardholderIdDocumentFrontXae327429Branch {
  Branch1,
  File,
}

public sealed class InlineIssuingCardholderIdDocumentFrontXae327429DecodingException(
  message: String,
) : SerializationException(message)

public class InlineIssuingCardholderIdDocumentFrontXae327429NoMatchException(
  message: String,
) : InlineIssuingCardholderIdDocumentFrontXae327429DecodingException(message)

internal data class InlineIssuingCardholderIdDocumentFrontXae327429Inspection(
  public val matchesBranch1: Boolean,
  public val matchesFile: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesFile).count { it }
}

/**
 * The front of a document returned by a [file upload](https://api.stripe.com#create_file) with a `purpose` value of
 * `identity_document`.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing_cardholder_id_document/properties/front
 */
@Serializable(with = InlineIssuingCardholderIdDocumentFrontXae327429.Serializer::class)
public class InlineIssuingCardholderIdDocumentFrontXae327429 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineIssuingCardholderIdDocumentFrontXae327429Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val `file`: File? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesFile) json.decodeFromJsonElement<File>(raw) else null }

  public val matchedBranches: Set<InlineIssuingCardholderIdDocumentFrontXae327429Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineIssuingCardholderIdDocumentFrontXae327429Branch.Branch1)
      if (inspection.matchesFile) add(InlineIssuingCardholderIdDocumentFrontXae327429Branch.File)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineIssuingCardholderIdDocumentFrontXae327429 {
      val inspection = inspectInlineIssuingCardholderIdDocumentFrontXae327429(raw)
      if (inspection.matchCount == 0) {
        throw InlineIssuingCardholderIdDocumentFrontXae327429NoMatchException("InlineIssuingCardholderIdDocumentFrontXae327429 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineIssuingCardholderIdDocumentFrontXae327429(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineIssuingCardholderIdDocumentFrontXae327429> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineIssuingCardholderIdDocumentFrontXae327429 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineIssuingCardholderIdDocumentFrontXae327429")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineIssuingCardholderIdDocumentFrontXae327429) {
      encoder.requireJsonEncoder("InlineIssuingCardholderIdDocumentFrontXae327429").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineIssuingCardholderIdDocumentFrontXae327429(element: JsonElement): InlineIssuingCardholderIdDocumentFrontXae327429Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesFile = element.isJsonDecodable<File>()
  return InlineIssuingCardholderIdDocumentFrontXae327429Inspection(
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
