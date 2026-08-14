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

public enum class InlineLegalEntityPersonVerificationDocumentFrontX647b8abeBranch {
  Branch1,
  File,
}

public sealed class InlineLegalEntityPersonVerificationDocumentFrontX647b8abeDecodingException(
  message: String,
) : SerializationException(message)

public class InlineLegalEntityPersonVerificationDocumentFrontX647b8abeNoMatchException(
  message: String,
) : InlineLegalEntityPersonVerificationDocumentFrontX647b8abeDecodingException(message)

internal data class InlineLegalEntityPersonVerificationDocumentFrontX647b8abeInspection(
  public val matchesBranch1: Boolean,
  public val matchesFile: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesFile).count { it }
}

/**
 * The front of an ID returned by a [file upload](https://api.stripe.com#create_file) with a `purpose` value of
 * `identity_document`.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/legal_entity_person_verification_document/properties/front
 */
@Serializable(with = InlineLegalEntityPersonVerificationDocumentFrontX647b8abe.Serializer::class)
public class InlineLegalEntityPersonVerificationDocumentFrontX647b8abe internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineLegalEntityPersonVerificationDocumentFrontX647b8abeInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val `file`: File? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesFile) json.decodeFromJsonElement<File>(raw) else null }

  public val matchedBranches: Set<InlineLegalEntityPersonVerificationDocumentFrontX647b8abeBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineLegalEntityPersonVerificationDocumentFrontX647b8abeBranch.Branch1)
      if (inspection.matchesFile) add(InlineLegalEntityPersonVerificationDocumentFrontX647b8abeBranch.File)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineLegalEntityPersonVerificationDocumentFrontX647b8abe {
      val inspection = inspectInlineLegalEntityPersonVerificationDocumentFrontX647b8abe(raw)
      if (inspection.matchCount == 0) {
        throw InlineLegalEntityPersonVerificationDocumentFrontX647b8abeNoMatchException("InlineLegalEntityPersonVerificationDocumentFrontX647b8abe matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineLegalEntityPersonVerificationDocumentFrontX647b8abe(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineLegalEntityPersonVerificationDocumentFrontX647b8abe> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineLegalEntityPersonVerificationDocumentFrontX647b8abe {
      val jsonDecoder = decoder.requireJsonDecoder("InlineLegalEntityPersonVerificationDocumentFrontX647b8abe")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineLegalEntityPersonVerificationDocumentFrontX647b8abe) {
      encoder.requireJsonEncoder("InlineLegalEntityPersonVerificationDocumentFrontX647b8abe").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineLegalEntityPersonVerificationDocumentFrontX647b8abe(element: JsonElement): InlineLegalEntityPersonVerificationDocumentFrontX647b8abeInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesFile = element.isJsonDecodable<File>()
  return InlineLegalEntityPersonVerificationDocumentFrontX647b8abeInspection(
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
