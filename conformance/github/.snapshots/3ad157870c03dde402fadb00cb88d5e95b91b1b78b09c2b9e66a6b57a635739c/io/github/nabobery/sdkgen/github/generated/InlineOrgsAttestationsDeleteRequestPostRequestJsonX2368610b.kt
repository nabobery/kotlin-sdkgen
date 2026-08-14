package io.github.nabobery.sdkgen.github.generated

import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

public sealed class InlineOrgsAttestationsDeleteRequestPostRequestJsonX2368610bDecodingException(
  message: String,
) : SerializationException(message)

public class InlineOrgsAttestationsDeleteRequestPostRequestJsonX2368610bNoMatchException(
  message: String,
) : InlineOrgsAttestationsDeleteRequestPostRequestJsonX2368610bDecodingException(message)

public class InlineOrgsAttestationsDeleteRequestPostRequestJsonX2368610bAmbiguityException(
  message: String,
) : InlineOrgsAttestationsDeleteRequestPostRequestJsonX2368610bDecodingException(message)

public class InlineOrgsAttestationsDeleteRequestPostRequestJsonX2368610bBranchValidationException(
  message: String,
) : InlineOrgsAttestationsDeleteRequestPostRequestJsonX2368610bDecodingException(message)

/**
 * The request body must include either `subject_digests` or `attestation_ids`, but not both.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1attestations~1delete-request/post/requestBody/content/application~
 * 1json/schema
 */
@Serializable(with = InlineOrgsAttestationsDeleteRequestPostRequestJsonX2368610bSerializer::class)
public sealed interface InlineOrgsAttestationsDeleteRequestPostRequestJsonX2368610b {
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonObject

  public class InlineOrgsAttestationsDeleteRequestPostRequestJsonOneOf1Xf96e12a4 internal constructor(
    subjectDigests: List<String>,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineOrgsAttestationsDeleteRequestPostRequestJsonX2368610b {
    public val subjectDigests: List<String> = subjectDigests.toList()

    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(subjectDigests: List<String>): InlineOrgsAttestationsDeleteRequestPostRequestJsonOneOf1Xf96e12a4 {
        val subjectDigestsOwnershipSnapshot = subjectDigests.toList()
        val raw = buildJsonObject {
          put("subject_digests", SdkJson.encodeToJsonElement(subjectDigestsOwnershipSnapshot))
        }
        val inspection = inspectInlineOrgsAttestationsDeleteRequestPostRequestJsonX2368610b(raw)
        if (inspection.size == 0) {
          throw InlineOrgsAttestationsDeleteRequestPostRequestJsonX2368610bNoMatchException("InlineOrgsAttestationsDeleteRequestPostRequestJsonX2368610b matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.inlineOrgsAttestationsDeleteRequestPostRequestJsonOneOf1Xf96e12a4Matches) {
          throw InlineOrgsAttestationsDeleteRequestPostRequestJsonX2368610bBranchValidationException("InlineOrgsAttestationsDeleteRequestPostRequestJsonOneOf1Xf96e12a4 factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw InlineOrgsAttestationsDeleteRequestPostRequestJsonX2368610bAmbiguityException("InlineOrgsAttestationsDeleteRequestPostRequestJsonX2368610b matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return InlineOrgsAttestationsDeleteRequestPostRequestJsonOneOf1Xf96e12a4(
          subjectDigests = subjectDigestsOwnershipSnapshot,
          raw = raw,
        )
      }
    }
  }

  public class InlineOrgsAttestationsDeleteRequestPostRequestJsonOneOf2X1aa70362 internal constructor(
    attestationIds: List<Int>,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineOrgsAttestationsDeleteRequestPostRequestJsonX2368610b {
    public val attestationIds: List<Int> = attestationIds.toList()

    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(attestationIds: List<Int>): InlineOrgsAttestationsDeleteRequestPostRequestJsonOneOf2X1aa70362 {
        val attestationIdsOwnershipSnapshot = attestationIds.toList()
        val raw = buildJsonObject {
          put("attestation_ids", SdkJson.encodeToJsonElement(attestationIdsOwnershipSnapshot))
        }
        val inspection = inspectInlineOrgsAttestationsDeleteRequestPostRequestJsonX2368610b(raw)
        if (inspection.size == 0) {
          throw InlineOrgsAttestationsDeleteRequestPostRequestJsonX2368610bNoMatchException("InlineOrgsAttestationsDeleteRequestPostRequestJsonX2368610b matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.inlineOrgsAttestationsDeleteRequestPostRequestJsonOneOf2X1aa70362Matches) {
          throw InlineOrgsAttestationsDeleteRequestPostRequestJsonX2368610bBranchValidationException("InlineOrgsAttestationsDeleteRequestPostRequestJsonOneOf2X1aa70362 factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw InlineOrgsAttestationsDeleteRequestPostRequestJsonX2368610bAmbiguityException("InlineOrgsAttestationsDeleteRequestPostRequestJsonX2368610b matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return InlineOrgsAttestationsDeleteRequestPostRequestJsonOneOf2X1aa70362(
          attestationIds = attestationIdsOwnershipSnapshot,
          raw = raw,
        )
      }
    }
  }
}

internal object InlineOrgsAttestationsDeleteRequestPostRequestJsonX2368610bSerializer : KSerializer<InlineOrgsAttestationsDeleteRequestPostRequestJsonX2368610b> {
  override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

  override fun deserialize(decoder: Decoder): InlineOrgsAttestationsDeleteRequestPostRequestJsonX2368610b {
    val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsAttestationsDeleteRequestPostRequestJsonX2368610b")
    val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw InlineOrgsAttestationsDeleteRequestPostRequestJsonX2368610bNoMatchException("InlineOrgsAttestationsDeleteRequestPostRequestJsonX2368610b matched 0 branches: expected JSON object")
    val matches = inspectInlineOrgsAttestationsDeleteRequestPostRequestJsonX2368610b(rawObject)
    if (matches.size == 0) {
      throw InlineOrgsAttestationsDeleteRequestPostRequestJsonX2368610bNoMatchException("InlineOrgsAttestationsDeleteRequestPostRequestJsonX2368610b matched 0 branches: " + matches.failures.joinToString("; "))
    }
    if (matches.size > 1) {
      throw InlineOrgsAttestationsDeleteRequestPostRequestJsonX2368610bAmbiguityException("InlineOrgsAttestationsDeleteRequestPostRequestJsonX2368610b matched " + matches.size + " branches; expected exactly 1: " + matches.names.joinToString())
    }
    return when {
      matches.inlineOrgsAttestationsDeleteRequestPostRequestJsonOneOf1Xf96e12a4Matches -> InlineOrgsAttestationsDeleteRequestPostRequestJsonX2368610b.InlineOrgsAttestationsDeleteRequestPostRequestJsonOneOf1Xf96e12a4(subjectDigests = requireNotNull(matches.subjectDigests), raw = rawObject)
      matches.inlineOrgsAttestationsDeleteRequestPostRequestJsonOneOf2X1aa70362Matches -> InlineOrgsAttestationsDeleteRequestPostRequestJsonX2368610b.InlineOrgsAttestationsDeleteRequestPostRequestJsonOneOf2X1aa70362(attestationIds = requireNotNull(matches.attestationIds), raw = rawObject)
      else -> error("unreachable")
    }
  }

  override fun serialize(encoder: Encoder, `value`: InlineOrgsAttestationsDeleteRequestPostRequestJsonX2368610b) {
    encoder.requireJsonEncoder("InlineOrgsAttestationsDeleteRequestPostRequestJsonX2368610b").encodeJsonElement(value.raw)
  }
}

internal data class InlineOrgsAttestationsDeleteRequestPostRequestJsonX2368610bInspection(
  public val subjectDigests: List<String>?,
  public val subjectDigestsDecoded: Boolean,
  public val attestationIds: List<Int>?,
  public val attestationIdsDecoded: Boolean,
  public val inlineOrgsAttestationsDeleteRequestPostRequestJsonOneOf1Xf96e12a4Matches: Boolean,
  public val inlineOrgsAttestationsDeleteRequestPostRequestJsonOneOf2X1aa70362Matches: Boolean,
  public val rawEmpty: Boolean,
  public val failures: List<String>,
) {
  public val names: List<String>
    get() = buildList {
      if (inlineOrgsAttestationsDeleteRequestPostRequestJsonOneOf1Xf96e12a4Matches) add("InlineOrgsAttestationsDeleteRequestPostRequestJsonOneOf1Xf96e12a4")
      if (inlineOrgsAttestationsDeleteRequestPostRequestJsonOneOf2X1aa70362Matches) add("InlineOrgsAttestationsDeleteRequestPostRequestJsonOneOf2X1aa70362")
    }

  public val size: Int
    get() = names.size
}

private fun inspectInlineOrgsAttestationsDeleteRequestPostRequestJsonX2368610b(rawObject: JsonObject): InlineOrgsAttestationsDeleteRequestPostRequestJsonX2368610bInspection {
  val subjectDigestsResult = rawObject["subject_digests"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<List<String>>(element) } }
  val subjectDigests = subjectDigestsResult?.getOrNull()
  val subjectDigestsDecoded = subjectDigestsResult?.isSuccess == true
  val attestationIdsResult = rawObject["attestation_ids"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<List<Int>>(element) } }
  val attestationIds = attestationIdsResult?.getOrNull()
  val attestationIdsDecoded = attestationIdsResult?.isSuccess == true
  val rawEmpty = rawObject.isEmpty()
  val inlineOrgsAttestationsDeleteRequestPostRequestJsonOneOf1Xf96e12a4Matches = subjectDigestsDecoded
  val inlineOrgsAttestationsDeleteRequestPostRequestJsonOneOf2X1aa70362Matches = attestationIdsDecoded
  return InlineOrgsAttestationsDeleteRequestPostRequestJsonX2368610bInspection(
    subjectDigests = subjectDigests,
    subjectDigestsDecoded = subjectDigestsDecoded,
    attestationIds = attestationIds,
    attestationIdsDecoded = attestationIdsDecoded,
    inlineOrgsAttestationsDeleteRequestPostRequestJsonOneOf1Xf96e12a4Matches = inlineOrgsAttestationsDeleteRequestPostRequestJsonOneOf1Xf96e12a4Matches,
    inlineOrgsAttestationsDeleteRequestPostRequestJsonOneOf2X1aa70362Matches = inlineOrgsAttestationsDeleteRequestPostRequestJsonOneOf2X1aa70362Matches,
    rawEmpty = rawEmpty,
    failures = buildList {
      if (!inlineOrgsAttestationsDeleteRequestPostRequestJsonOneOf1Xf96e12a4Matches) add("InlineOrgsAttestationsDeleteRequestPostRequestJsonOneOf1Xf96e12a4: branch predicate did not match properties 'subject_digests'")
      if (!inlineOrgsAttestationsDeleteRequestPostRequestJsonOneOf2X1aa70362Matches) add("InlineOrgsAttestationsDeleteRequestPostRequestJsonOneOf2X1aa70362: branch predicate did not match properties 'attestation_ids'")
    },
  )
}

private fun JsonObject.stringValue(name: String): String? {
  val primitive = this[name] as? JsonPrimitive ?: return null
  return primitive.takeIf { it.isString }?.content
}
