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

public enum class InlineLegalEntityCompanyVerificationDocumentBackX113d3925Branch {
  Branch1,
  File,
}

public sealed class InlineLegalEntityCompanyVerificationDocumentBackX113d3925DecodingException(
  message: String,
) : SerializationException(message)

public class InlineLegalEntityCompanyVerificationDocumentBackX113d3925NoMatchException(
  message: String,
) : InlineLegalEntityCompanyVerificationDocumentBackX113d3925DecodingException(message)

internal data class InlineLegalEntityCompanyVerificationDocumentBackX113d3925Inspection(
  public val matchesBranch1: Boolean,
  public val matchesFile: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesFile).count { it }
}

/**
 * The back of a document returned by a [file upload](https://api.stripe.com#create_file) with a `purpose` value of
 * `additional_verification`. Note that `additional_verification` files are [not
 * downloadable](/file-upload#uploading-a-file).
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/legal_entity_company_verification_document/properties/back
 */
@Serializable(with = InlineLegalEntityCompanyVerificationDocumentBackX113d3925.Serializer::class)
public class InlineLegalEntityCompanyVerificationDocumentBackX113d3925 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineLegalEntityCompanyVerificationDocumentBackX113d3925Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val `file`: File? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesFile) json.decodeFromJsonElement<File>(raw) else null }

  public val matchedBranches: Set<InlineLegalEntityCompanyVerificationDocumentBackX113d3925Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineLegalEntityCompanyVerificationDocumentBackX113d3925Branch.Branch1)
      if (inspection.matchesFile) add(InlineLegalEntityCompanyVerificationDocumentBackX113d3925Branch.File)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineLegalEntityCompanyVerificationDocumentBackX113d3925 {
      val inspection = inspectInlineLegalEntityCompanyVerificationDocumentBackX113d3925(raw)
      if (inspection.matchCount == 0) {
        throw InlineLegalEntityCompanyVerificationDocumentBackX113d3925NoMatchException("InlineLegalEntityCompanyVerificationDocumentBackX113d3925 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineLegalEntityCompanyVerificationDocumentBackX113d3925(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineLegalEntityCompanyVerificationDocumentBackX113d3925> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineLegalEntityCompanyVerificationDocumentBackX113d3925 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineLegalEntityCompanyVerificationDocumentBackX113d3925")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineLegalEntityCompanyVerificationDocumentBackX113d3925) {
      encoder.requireJsonEncoder("InlineLegalEntityCompanyVerificationDocumentBackX113d3925").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineLegalEntityCompanyVerificationDocumentBackX113d3925(element: JsonElement): InlineLegalEntityCompanyVerificationDocumentBackX113d3925Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesFile = element.isJsonDecodable<File>()
  return InlineLegalEntityCompanyVerificationDocumentBackX113d3925Inspection(
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
