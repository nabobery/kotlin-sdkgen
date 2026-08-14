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

public enum class InlineLegalEntityPersonVerificationDocumentBackXd6f30a0cBranch {
  Branch1,
  File,
}

public sealed class InlineLegalEntityPersonVerificationDocumentBackXd6f30a0cDecodingException(
  message: String,
) : SerializationException(message)

public class InlineLegalEntityPersonVerificationDocumentBackXd6f30a0cNoMatchException(
  message: String,
) : InlineLegalEntityPersonVerificationDocumentBackXd6f30a0cDecodingException(message)

internal data class InlineLegalEntityPersonVerificationDocumentBackXd6f30a0cInspection(
  public val matchesBranch1: Boolean,
  public val matchesFile: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesFile).count { it }
}

/**
 * The back of an ID returned by a [file upload](https://api.stripe.com#create_file) with a `purpose` value of
 * `identity_document`.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/legal_entity_person_verification_document/properties/back
 */
@Serializable(with = InlineLegalEntityPersonVerificationDocumentBackXd6f30a0c.Serializer::class)
public class InlineLegalEntityPersonVerificationDocumentBackXd6f30a0c internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineLegalEntityPersonVerificationDocumentBackXd6f30a0cInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val `file`: File? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesFile) json.decodeFromJsonElement<File>(raw) else null }

  public val matchedBranches: Set<InlineLegalEntityPersonVerificationDocumentBackXd6f30a0cBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineLegalEntityPersonVerificationDocumentBackXd6f30a0cBranch.Branch1)
      if (inspection.matchesFile) add(InlineLegalEntityPersonVerificationDocumentBackXd6f30a0cBranch.File)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineLegalEntityPersonVerificationDocumentBackXd6f30a0c {
      val inspection = inspectInlineLegalEntityPersonVerificationDocumentBackXd6f30a0c(raw)
      if (inspection.matchCount == 0) {
        throw InlineLegalEntityPersonVerificationDocumentBackXd6f30a0cNoMatchException("InlineLegalEntityPersonVerificationDocumentBackXd6f30a0c matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineLegalEntityPersonVerificationDocumentBackXd6f30a0c(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineLegalEntityPersonVerificationDocumentBackXd6f30a0c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineLegalEntityPersonVerificationDocumentBackXd6f30a0c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineLegalEntityPersonVerificationDocumentBackXd6f30a0c")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineLegalEntityPersonVerificationDocumentBackXd6f30a0c) {
      encoder.requireJsonEncoder("InlineLegalEntityPersonVerificationDocumentBackXd6f30a0c").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineLegalEntityPersonVerificationDocumentBackXd6f30a0c(element: JsonElement): InlineLegalEntityPersonVerificationDocumentBackXd6f30a0cInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesFile = element.isJsonDecodable<File>()
  return InlineLegalEntityPersonVerificationDocumentBackXd6f30a0cInspection(
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
