package com.nabobery.sdkgen.github.generated

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

public sealed class InlineUsersAttestationsDeleteRequestPostRequestJsonX2b76e62aDecodingException(
  message: String,
) : SerializationException(message)

public class InlineUsersAttestationsDeleteRequestPostRequestJsonX2b76e62aNoMatchException(
  message: String,
) : InlineUsersAttestationsDeleteRequestPostRequestJsonX2b76e62aDecodingException(message)

public class InlineUsersAttestationsDeleteRequestPostRequestJsonX2b76e62aAmbiguityException(
  message: String,
) : InlineUsersAttestationsDeleteRequestPostRequestJsonX2b76e62aDecodingException(message)

public class InlineUsersAttestationsDeleteRequestPostRequestJsonX2b76e62aBranchValidationException(
  message: String,
) : InlineUsersAttestationsDeleteRequestPostRequestJsonX2b76e62aDecodingException(message)

/**
 * The request body must include either `subject_digests` or `attestation_ids`, but not both.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1users~1{username}~1attestations~1delete-request/post/requestBody/content/applic
 * ation~1json/schema
 */
@Serializable(with = InlineUsersAttestationsDeleteRequestPostRequestJsonX2b76e62a.Serializer::class)
public sealed interface InlineUsersAttestationsDeleteRequestPostRequestJsonX2b76e62a {
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonObject

  public class InlineUsersAttestationsDeleteRequestPostRequestJsonOneOf1Xcf8efcf0 internal constructor(
    public val subjectDigests: List<String>,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineUsersAttestationsDeleteRequestPostRequestJsonX2b76e62a {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(subjectDigests: List<String>): InlineUsersAttestationsDeleteRequestPostRequestJsonOneOf1Xcf8efcf0 {
        val raw = buildJsonObject {
              put("subject_digests", SdkJson.encodeToJsonElement(subjectDigests))
            }
        val inspection = inspectInlineUsersAttestationsDeleteRequestPostRequestJsonX2b76e62a(raw)
        if (inspection.size == 0) {
          throw InlineUsersAttestationsDeleteRequestPostRequestJsonX2b76e62aNoMatchException("InlineUsersAttestationsDeleteRequestPostRequestJsonX2b76e62a matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.InlineUsersAttestationsDeleteRequestPostRequestJsonOneOf1Xcf8efcf0Matches) {
          throw InlineUsersAttestationsDeleteRequestPostRequestJsonX2b76e62aBranchValidationException("InlineUsersAttestationsDeleteRequestPostRequestJsonOneOf1Xcf8efcf0 factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw InlineUsersAttestationsDeleteRequestPostRequestJsonX2b76e62aAmbiguityException("InlineUsersAttestationsDeleteRequestPostRequestJsonX2b76e62a matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return InlineUsersAttestationsDeleteRequestPostRequestJsonOneOf1Xcf8efcf0(
          subjectDigests = subjectDigests,
          raw = raw,
        )
      }
    }
  }

  public class InlineUsersAttestationsDeleteRequestPostRequestJsonOneOf2Xf9ae1434 internal constructor(
    public val attestationIds: List<Int>,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineUsersAttestationsDeleteRequestPostRequestJsonX2b76e62a {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(attestationIds: List<Int>): InlineUsersAttestationsDeleteRequestPostRequestJsonOneOf2Xf9ae1434 {
        val raw = buildJsonObject {
              put("attestation_ids", SdkJson.encodeToJsonElement(attestationIds))
            }
        val inspection = inspectInlineUsersAttestationsDeleteRequestPostRequestJsonX2b76e62a(raw)
        if (inspection.size == 0) {
          throw InlineUsersAttestationsDeleteRequestPostRequestJsonX2b76e62aNoMatchException("InlineUsersAttestationsDeleteRequestPostRequestJsonX2b76e62a matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.InlineUsersAttestationsDeleteRequestPostRequestJsonOneOf2Xf9ae1434Matches) {
          throw InlineUsersAttestationsDeleteRequestPostRequestJsonX2b76e62aBranchValidationException("InlineUsersAttestationsDeleteRequestPostRequestJsonOneOf2Xf9ae1434 factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw InlineUsersAttestationsDeleteRequestPostRequestJsonX2b76e62aAmbiguityException("InlineUsersAttestationsDeleteRequestPostRequestJsonX2b76e62a matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return InlineUsersAttestationsDeleteRequestPostRequestJsonOneOf2Xf9ae1434(
          attestationIds = attestationIds,
          raw = raw,
        )
      }
    }
  }

  public object Serializer : KSerializer<InlineUsersAttestationsDeleteRequestPostRequestJsonX2b76e62a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineUsersAttestationsDeleteRequestPostRequestJsonX2b76e62a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineUsersAttestationsDeleteRequestPostRequestJsonX2b76e62a")
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw InlineUsersAttestationsDeleteRequestPostRequestJsonX2b76e62aNoMatchException("InlineUsersAttestationsDeleteRequestPostRequestJsonX2b76e62a matched 0 branches: expected JSON object")
      val matches = inspectInlineUsersAttestationsDeleteRequestPostRequestJsonX2b76e62a(rawObject)
      if (matches.size == 0) {
        throw InlineUsersAttestationsDeleteRequestPostRequestJsonX2b76e62aNoMatchException("InlineUsersAttestationsDeleteRequestPostRequestJsonX2b76e62a matched 0 branches: " + matches.failures.joinToString("; "))
      }
      if (matches.size > 1) {
        throw InlineUsersAttestationsDeleteRequestPostRequestJsonX2b76e62aAmbiguityException("InlineUsersAttestationsDeleteRequestPostRequestJsonX2b76e62a matched " + matches.size + " branches; expected exactly 1: " + matches.names.joinToString())
      }
      return when {
        matches.InlineUsersAttestationsDeleteRequestPostRequestJsonOneOf1Xcf8efcf0Matches -> InlineUsersAttestationsDeleteRequestPostRequestJsonOneOf1Xcf8efcf0(subjectDigests = requireNotNull(matches.subjectDigests), raw = rawObject)
        matches.InlineUsersAttestationsDeleteRequestPostRequestJsonOneOf2Xf9ae1434Matches -> InlineUsersAttestationsDeleteRequestPostRequestJsonOneOf2Xf9ae1434(attestationIds = requireNotNull(matches.attestationIds), raw = rawObject)
        else -> error("unreachable")
      }
    }

    override fun serialize(encoder: Encoder, `value`: InlineUsersAttestationsDeleteRequestPostRequestJsonX2b76e62a) {
      encoder.requireJsonEncoder("InlineUsersAttestationsDeleteRequestPostRequestJsonX2b76e62a").encodeJsonElement(value.raw)
    }
  }
}

internal data class InlineUsersAttestationsDeleteRequestPostRequestJsonX2b76e62aInspection(
  public val subjectDigests: List<String>?,
  public val subjectDigestsDecoded: Boolean,
  public val attestationIds: List<Int>?,
  public val attestationIdsDecoded: Boolean,
  public val InlineUsersAttestationsDeleteRequestPostRequestJsonOneOf1Xcf8efcf0Matches: Boolean,
  public val InlineUsersAttestationsDeleteRequestPostRequestJsonOneOf2Xf9ae1434Matches: Boolean,
  public val rawEmpty: Boolean,
  public val failures: List<String>,
) {
  public val names: List<String>
    get() = buildList {
      if (InlineUsersAttestationsDeleteRequestPostRequestJsonOneOf1Xcf8efcf0Matches) add("InlineUsersAttestationsDeleteRequestPostRequestJsonOneOf1Xcf8efcf0")
      if (InlineUsersAttestationsDeleteRequestPostRequestJsonOneOf2Xf9ae1434Matches) add("InlineUsersAttestationsDeleteRequestPostRequestJsonOneOf2Xf9ae1434")
    }

  public val size: Int
    get() = names.size
}

private fun inspectInlineUsersAttestationsDeleteRequestPostRequestJsonX2b76e62a(rawObject: JsonObject): InlineUsersAttestationsDeleteRequestPostRequestJsonX2b76e62aInspection {
  val subjectDigestsResult = rawObject["subject_digests"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<List<String>>(element) } }
  val subjectDigests = subjectDigestsResult?.getOrNull()
  val subjectDigestsDecoded = subjectDigestsResult?.isSuccess == true
  val attestationIdsResult = rawObject["attestation_ids"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<List<Int>>(element) } }
  val attestationIds = attestationIdsResult?.getOrNull()
  val attestationIdsDecoded = attestationIdsResult?.isSuccess == true
  val rawEmpty = rawObject.isEmpty()
  val InlineUsersAttestationsDeleteRequestPostRequestJsonOneOf1Xcf8efcf0Matches = subjectDigestsDecoded
  val InlineUsersAttestationsDeleteRequestPostRequestJsonOneOf2Xf9ae1434Matches = attestationIdsDecoded
  return InlineUsersAttestationsDeleteRequestPostRequestJsonX2b76e62aInspection(
    subjectDigests = subjectDigests,
    subjectDigestsDecoded = subjectDigestsDecoded,
    attestationIds = attestationIds,
    attestationIdsDecoded = attestationIdsDecoded,
    InlineUsersAttestationsDeleteRequestPostRequestJsonOneOf1Xcf8efcf0Matches = InlineUsersAttestationsDeleteRequestPostRequestJsonOneOf1Xcf8efcf0Matches,
    InlineUsersAttestationsDeleteRequestPostRequestJsonOneOf2Xf9ae1434Matches = InlineUsersAttestationsDeleteRequestPostRequestJsonOneOf2Xf9ae1434Matches,
    rawEmpty = rawEmpty,
    failures = buildList {
      if (!InlineUsersAttestationsDeleteRequestPostRequestJsonOneOf1Xcf8efcf0Matches) add("InlineUsersAttestationsDeleteRequestPostRequestJsonOneOf1Xcf8efcf0: branch predicate did not match properties 'subject_digests'")
      if (!InlineUsersAttestationsDeleteRequestPostRequestJsonOneOf2Xf9ae1434Matches) add("InlineUsersAttestationsDeleteRequestPostRequestJsonOneOf2Xf9ae1434: branch predicate did not match properties 'attestation_ids'")
    },
  )
}

private fun JsonObject.stringValue(name: String): String? {
  val primitive = this[name] as? JsonPrimitive ?: return null
  return primitive.takeIf { it.isString }?.content
}
