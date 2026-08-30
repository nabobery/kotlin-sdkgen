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

public enum class InlineV1IdentityVerificationSessionsPostRequestFormOptionsDocumentX77849d44Branch {
  InlineV1IdentityVerificatid8e1PostRequestFormOptionsDocumentAnyOf1X48bf9ed9,
  InlineV1IdentityVerificatid8e1PostRequestFormOptionsDocumentAnyOf2X3b77c443,
}

public sealed class InlineV1IdentityVerificationSessionsPostRequestFormOptionsDocumentX77849d44DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1IdentityVerificationSessionsPostRequestFormOptionsDocumentX77849d44NoMatchException(
  message: String,
) : InlineV1IdentityVerificationSessionsPostRequestFormOptionsDocumentX77849d44DecodingException(message)

internal data class InlineV1IdentityVerificationSessionsPostRequestFormOptionsDocumentX77849d44Inspection(
  public val matchesInlineV1IdentityVerificatid8e1PostRequestFormOptionsDocumentAnyOf1X48bf9ed9:
      Boolean,
  public val matchesInlineV1IdentityVerificatid8e1PostRequestFormOptionsDocumentAnyOf2X3b77c443:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1IdentityVerificatid8e1PostRequestFormOptionsDocumentAnyOf1X48bf9ed9, matchesInlineV1IdentityVerificatid8e1PostRequestFormOptionsDocumentAnyOf2X3b77c443).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1identity~1verification_sessions/post/requestBody/content/application~1x-www
 * -form-urlencoded/schema/properties/options/properties/document.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1identity~1verification_sessions/post/requestBody/content/application~1x-www
 * -form-urlencoded/schema/properties/options/properties/document
 */
@Serializable(with = InlineV1IdentityVerificationSessionsPostRequestFormOptionsDocumentX77849d44.Serializer::class)
public class InlineV1IdentityVerificationSessionsPostRequestFormOptionsDocumentX77849d44 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1IdentityVerificationSessionsPostRequestFormOptionsDocumentX77849d44Inspection,
) {
  public val inlineV1IdentityVerificatid8e1PostRequestFormOptionsDocumentAnyOf1X48bf9ed9:
      InlineV1IdentityVerificatid8e1PostRequestFormOptionsDocumentAnyOf1X48bf9ed9? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1IdentityVerificatid8e1PostRequestFormOptionsDocumentAnyOf1X48bf9ed9) json.decodeFromJsonElement<InlineV1IdentityVerificatid8e1PostRequestFormOptionsDocumentAnyOf1X48bf9ed9>(raw) else null }

  public val inlineV1IdentityVerificatid8e1PostRequestFormOptionsDocumentAnyOf2X3b77c443:
      InlineV1IdentityVerificatid8e1PostRequestFormOptionsDocumentAnyOf2X3b77c443? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1IdentityVerificatid8e1PostRequestFormOptionsDocumentAnyOf2X3b77c443) json.decodeFromJsonElement<InlineV1IdentityVerificatid8e1PostRequestFormOptionsDocumentAnyOf2X3b77c443>(raw) else null }

  public val matchedBranches:
      Set<InlineV1IdentityVerificationSessionsPostRequestFormOptionsDocumentX77849d44Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1IdentityVerificatid8e1PostRequestFormOptionsDocumentAnyOf1X48bf9ed9) add(InlineV1IdentityVerificationSessionsPostRequestFormOptionsDocumentX77849d44Branch.InlineV1IdentityVerificatid8e1PostRequestFormOptionsDocumentAnyOf1X48bf9ed9)
      if (inspection.matchesInlineV1IdentityVerificatid8e1PostRequestFormOptionsDocumentAnyOf2X3b77c443) add(InlineV1IdentityVerificationSessionsPostRequestFormOptionsDocumentX77849d44Branch.InlineV1IdentityVerificatid8e1PostRequestFormOptionsDocumentAnyOf2X3b77c443)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1IdentityVerificationSessionsPostRequestFormOptionsDocumentX77849d44 {
      val inspection = inspectInlineV1IdentityVerificationSessionsPostRequestFormOptionsDocumentX77849d44(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1IdentityVerificationSessionsPostRequestFormOptionsDocumentX77849d44NoMatchException("InlineV1IdentityVerificationSessionsPostRequestFormOptionsDocumentX77849d44 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1IdentityVerificationSessionsPostRequestFormOptionsDocumentX77849d44(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1IdentityVerificationSessionsPostRequestFormOptionsDocumentX77849d44> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1IdentityVerificationSessionsPostRequestFormOptionsDocumentX77849d44 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1IdentityVerificationSessionsPostRequestFormOptionsDocumentX77849d44")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1IdentityVerificationSessionsPostRequestFormOptionsDocumentX77849d44) {
      encoder.requireJsonEncoder("InlineV1IdentityVerificationSessionsPostRequestFormOptionsDocumentX77849d44").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1IdentityVerificationSessionsPostRequestFormOptionsDocumentX77849d44(element: JsonElement): InlineV1IdentityVerificationSessionsPostRequestFormOptionsDocumentX77849d44Inspection {
  val matchesInlineV1IdentityVerificatid8e1PostRequestFormOptionsDocumentAnyOf1X48bf9ed9 = element.isJsonDecodable<InlineV1IdentityVerificatid8e1PostRequestFormOptionsDocumentAnyOf1X48bf9ed9>()
  val matchesInlineV1IdentityVerificatid8e1PostRequestFormOptionsDocumentAnyOf2X3b77c443 = element.isJsonDecodable<InlineV1IdentityVerificatid8e1PostRequestFormOptionsDocumentAnyOf2X3b77c443>()
  return InlineV1IdentityVerificationSessionsPostRequestFormOptionsDocumentX77849d44Inspection(
    matchesInlineV1IdentityVerificatid8e1PostRequestFormOptionsDocumentAnyOf1X48bf9ed9 = matchesInlineV1IdentityVerificatid8e1PostRequestFormOptionsDocumentAnyOf1X48bf9ed9,
    matchesInlineV1IdentityVerificatid8e1PostRequestFormOptionsDocumentAnyOf2X3b77c443 = matchesInlineV1IdentityVerificatid8e1PostRequestFormOptionsDocumentAnyOf2X3b77c443,
    failures = buildList {
      if (!matchesInlineV1IdentityVerificatid8e1PostRequestFormOptionsDocumentAnyOf1X48bf9ed9) add("InlineV1IdentityVerificatid8e1PostRequestFormOptionsDocumentAnyOf1X48bf9ed9: value does not match InlineV1IdentityVerificatid8e1PostRequestFormOptionsDocumentAnyOf1X48bf9ed9")
      if (!matchesInlineV1IdentityVerificatid8e1PostRequestFormOptionsDocumentAnyOf2X3b77c443) add("InlineV1IdentityVerificatid8e1PostRequestFormOptionsDocumentAnyOf2X3b77c443: value does not match InlineV1IdentityVerificatid8e1PostRequestFormOptionsDocumentAnyOf2X3b77c443")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
