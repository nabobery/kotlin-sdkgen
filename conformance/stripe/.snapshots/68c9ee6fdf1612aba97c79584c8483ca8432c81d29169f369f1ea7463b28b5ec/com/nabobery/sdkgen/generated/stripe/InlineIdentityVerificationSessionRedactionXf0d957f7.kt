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
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineIdentityVerificationSessionRedactionXf0d957f7Branch {
  VerificationSessionRedaction,
}

public sealed class InlineIdentityVerificationSessionRedactionXf0d957f7DecodingException(
  message: String,
) : SerializationException(message)

public class InlineIdentityVerificationSessionRedactionXf0d957f7NoMatchException(
  message: String,
) : InlineIdentityVerificationSessionRedactionXf0d957f7DecodingException(message)

internal data class InlineIdentityVerificationSessionRedactionXf0d957f7Inspection(
  public val matchesVerificationSessionRedaction: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesVerificationSessionRedaction).count { it }
}

/**
 * Redaction status of this VerificationSession. If the VerificationSession is not redacted, this field will be null.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/identity.verification_session/properties/redaction
 */
@Serializable(with = InlineIdentityVerificationSessionRedactionXf0d957f7.Serializer::class)
public class InlineIdentityVerificationSessionRedactionXf0d957f7 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineIdentityVerificationSessionRedactionXf0d957f7Inspection,
) {
  public val verificationSessionRedaction: VerificationSessionRedactionView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesVerificationSessionRedaction) json.decodeFromJsonElement<VerificationSessionRedactionView>(raw) else null }

  public val matchedBranches: Set<InlineIdentityVerificationSessionRedactionXf0d957f7Branch>
    get() = buildSet {
      if (inspection.matchesVerificationSessionRedaction) add(InlineIdentityVerificationSessionRedactionXf0d957f7Branch.VerificationSessionRedaction)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineIdentityVerificationSessionRedactionXf0d957f7 {
      val inspection = inspectInlineIdentityVerificationSessionRedactionXf0d957f7(raw)
      if (inspection.matchCount == 0) {
        throw InlineIdentityVerificationSessionRedactionXf0d957f7NoMatchException("InlineIdentityVerificationSessionRedactionXf0d957f7 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineIdentityVerificationSessionRedactionXf0d957f7(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineIdentityVerificationSessionRedactionXf0d957f7> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineIdentityVerificationSessionRedactionXf0d957f7 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineIdentityVerificationSessionRedactionXf0d957f7")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineIdentityVerificationSessionRedactionXf0d957f7) {
      encoder.requireJsonEncoder("InlineIdentityVerificationSessionRedactionXf0d957f7").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineIdentityVerificationSessionRedactionXf0d957f7(element: JsonElement): InlineIdentityVerificationSessionRedactionXf0d957f7Inspection {
  val raw = element as? JsonObject ?: return InlineIdentityVerificationSessionRedactionXf0d957f7Inspection(
    matchesVerificationSessionRedaction = false,
    failures = listOf("VerificationSessionRedaction: expected JSON object"),
  )
  val matchesVerificationSessionRedaction = raw["status"] != null
  return InlineIdentityVerificationSessionRedactionXf0d957f7Inspection(
    matchesVerificationSessionRedaction = matchesVerificationSessionRedaction,
    failures = buildList {
      if (!matchesVerificationSessionRedaction) add("VerificationSessionRedaction: required properties 'status' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
