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

public enum class InlineGelatoPhoneReportErrorX675018ccBranch {
  GelatoPhoneReportError,
}

public sealed class InlineGelatoPhoneReportErrorX675018ccDecodingException(
  message: String,
) : SerializationException(message)

public class InlineGelatoPhoneReportErrorX675018ccNoMatchException(
  message: String,
) : InlineGelatoPhoneReportErrorX675018ccDecodingException(message)

internal data class InlineGelatoPhoneReportErrorX675018ccInspection(
  public val matchesGelatoPhoneReportError: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesGelatoPhoneReportError).count { it }
}

/**
 * Details on the verification error. Present when status is `unverified`.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/gelato_phone_report/properties/error
 */
@Serializable(with = InlineGelatoPhoneReportErrorX675018cc.Serializer::class)
public class InlineGelatoPhoneReportErrorX675018cc internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineGelatoPhoneReportErrorX675018ccInspection,
) {
  public val gelatoPhoneReportError: GelatoPhoneReportErrorView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesGelatoPhoneReportError) json.decodeFromJsonElement<GelatoPhoneReportErrorView>(raw) else null }

  public val matchedBranches: Set<InlineGelatoPhoneReportErrorX675018ccBranch>
    get() = buildSet {
      if (inspection.matchesGelatoPhoneReportError) add(InlineGelatoPhoneReportErrorX675018ccBranch.GelatoPhoneReportError)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineGelatoPhoneReportErrorX675018cc {
      val inspection = inspectInlineGelatoPhoneReportErrorX675018cc(raw)
      if (inspection.matchCount == 0) {
        throw InlineGelatoPhoneReportErrorX675018ccNoMatchException("InlineGelatoPhoneReportErrorX675018cc matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineGelatoPhoneReportErrorX675018cc(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineGelatoPhoneReportErrorX675018cc> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineGelatoPhoneReportErrorX675018cc {
      val jsonDecoder = decoder.requireJsonDecoder("InlineGelatoPhoneReportErrorX675018cc")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineGelatoPhoneReportErrorX675018cc) {
      encoder.requireJsonEncoder("InlineGelatoPhoneReportErrorX675018cc").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineGelatoPhoneReportErrorX675018cc(element: JsonElement): InlineGelatoPhoneReportErrorX675018ccInspection {
  val raw = element as? JsonObject ?: return InlineGelatoPhoneReportErrorX675018ccInspection(
    matchesGelatoPhoneReportError = false,
    failures = listOf("GelatoPhoneReportError: expected JSON object"),
  )
  val matchesGelatoPhoneReportError = true
  return InlineGelatoPhoneReportErrorX675018ccInspection(
    matchesGelatoPhoneReportError = matchesGelatoPhoneReportError,
    failures = buildList {
      if (!matchesGelatoPhoneReportError) add("GelatoPhoneReportError: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
