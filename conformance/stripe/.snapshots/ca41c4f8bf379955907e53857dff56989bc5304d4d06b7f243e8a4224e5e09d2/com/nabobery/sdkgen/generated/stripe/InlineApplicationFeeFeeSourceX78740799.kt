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

public enum class InlineApplicationFeeFeeSourceX78740799Branch {
  PlatformEarningFeeSource,
}

public sealed class InlineApplicationFeeFeeSourceX78740799DecodingException(
  message: String,
) : SerializationException(message)

public class InlineApplicationFeeFeeSourceX78740799NoMatchException(
  message: String,
) : InlineApplicationFeeFeeSourceX78740799DecodingException(message)

internal data class InlineApplicationFeeFeeSourceX78740799Inspection(
  public val matchesPlatformEarningFeeSource: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesPlatformEarningFeeSource).count { it }
}

/**
 * Polymorphic source of the application fee. Includes the ID of the object the application fee was created from.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/application_fee/properties/fee_source
 */
@Serializable(with = InlineApplicationFeeFeeSourceX78740799.Serializer::class)
public class InlineApplicationFeeFeeSourceX78740799 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineApplicationFeeFeeSourceX78740799Inspection,
) {
  public val platformEarningFeeSource: PlatformEarningFeeSourceView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPlatformEarningFeeSource) json.decodeFromJsonElement<PlatformEarningFeeSourceView>(raw) else null }

  public val matchedBranches: Set<InlineApplicationFeeFeeSourceX78740799Branch>
    get() = buildSet {
      if (inspection.matchesPlatformEarningFeeSource) add(InlineApplicationFeeFeeSourceX78740799Branch.PlatformEarningFeeSource)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineApplicationFeeFeeSourceX78740799 {
      val inspection = inspectInlineApplicationFeeFeeSourceX78740799(raw)
      if (inspection.matchCount == 0) {
        throw InlineApplicationFeeFeeSourceX78740799NoMatchException("InlineApplicationFeeFeeSourceX78740799 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineApplicationFeeFeeSourceX78740799(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineApplicationFeeFeeSourceX78740799> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineApplicationFeeFeeSourceX78740799 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineApplicationFeeFeeSourceX78740799")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineApplicationFeeFeeSourceX78740799) {
      encoder.requireJsonEncoder("InlineApplicationFeeFeeSourceX78740799").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineApplicationFeeFeeSourceX78740799(element: JsonElement): InlineApplicationFeeFeeSourceX78740799Inspection {
  val raw = element as? JsonObject ?: return InlineApplicationFeeFeeSourceX78740799Inspection(
    matchesPlatformEarningFeeSource = false,
    failures = listOf("PlatformEarningFeeSource: expected JSON object"),
  )
  val matchesPlatformEarningFeeSource = raw["type"] != null
  return InlineApplicationFeeFeeSourceX78740799Inspection(
    matchesPlatformEarningFeeSource = matchesPlatformEarningFeeSource,
    failures = buildList {
      if (!matchesPlatformEarningFeeSource) add("PlatformEarningFeeSource: required properties 'type' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
