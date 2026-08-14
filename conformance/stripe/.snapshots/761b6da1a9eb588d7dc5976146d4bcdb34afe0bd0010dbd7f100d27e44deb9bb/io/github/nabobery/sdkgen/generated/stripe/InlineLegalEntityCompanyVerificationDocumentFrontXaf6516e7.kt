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

public enum class InlineLegalEntityCompanyVerificationDocumentFrontXaf6516e7Branch {
  Branch1,
  File,
}

public sealed class InlineLegalEntityCompanyVerificationDocumentFrontXaf6516e7DecodingException(
  message: String,
) : SerializationException(message)

public class InlineLegalEntityCompanyVerificationDocumentFrontXaf6516e7NoMatchException(
  message: String,
) : InlineLegalEntityCompanyVerificationDocumentFrontXaf6516e7DecodingException(message)

internal data class InlineLegalEntityCompanyVerificationDocumentFrontXaf6516e7Inspection(
  public val matchesBranch1: Boolean,
  public val matchesFile: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesFile).count { it }
}

/**
 * The front of a document returned by a [file upload](https://api.stripe.com#create_file) with a `purpose` value of
 * `additional_verification`. Note that `additional_verification` files are [not
 * downloadable](/file-upload#uploading-a-file).
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/legal_entity_company_verification_document/properties/front
 */
@Serializable(with = InlineLegalEntityCompanyVerificationDocumentFrontXaf6516e7.Serializer::class)
public class InlineLegalEntityCompanyVerificationDocumentFrontXaf6516e7 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineLegalEntityCompanyVerificationDocumentFrontXaf6516e7Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val `file`: File? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesFile) json.decodeFromJsonElement<File>(raw) else null }

  public val matchedBranches: Set<InlineLegalEntityCompanyVerificationDocumentFrontXaf6516e7Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineLegalEntityCompanyVerificationDocumentFrontXaf6516e7Branch.Branch1)
      if (inspection.matchesFile) add(InlineLegalEntityCompanyVerificationDocumentFrontXaf6516e7Branch.File)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineLegalEntityCompanyVerificationDocumentFrontXaf6516e7 {
      val inspection = inspectInlineLegalEntityCompanyVerificationDocumentFrontXaf6516e7(raw)
      if (inspection.matchCount == 0) {
        throw InlineLegalEntityCompanyVerificationDocumentFrontXaf6516e7NoMatchException("InlineLegalEntityCompanyVerificationDocumentFrontXaf6516e7 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineLegalEntityCompanyVerificationDocumentFrontXaf6516e7(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineLegalEntityCompanyVerificationDocumentFrontXaf6516e7> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineLegalEntityCompanyVerificationDocumentFrontXaf6516e7 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineLegalEntityCompanyVerificationDocumentFrontXaf6516e7")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineLegalEntityCompanyVerificationDocumentFrontXaf6516e7) {
      encoder.requireJsonEncoder("InlineLegalEntityCompanyVerificationDocumentFrontXaf6516e7").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineLegalEntityCompanyVerificationDocumentFrontXaf6516e7(element: JsonElement): InlineLegalEntityCompanyVerificationDocumentFrontXaf6516e7Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesFile = element.isJsonDecodable<File>()
  return InlineLegalEntityCompanyVerificationDocumentFrontXaf6516e7Inspection(
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
