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

public enum class InlineGelatoSelfieReportErrorX46da4547Branch {
  GelatoSelfieReportError,
}

public sealed class InlineGelatoSelfieReportErrorX46da4547DecodingException(
  message: String,
) : SerializationException(message)

public class InlineGelatoSelfieReportErrorX46da4547NoMatchException(
  message: String,
) : InlineGelatoSelfieReportErrorX46da4547DecodingException(message)

internal data class InlineGelatoSelfieReportErrorX46da4547Inspection(
  public val matchesGelatoSelfieReportError: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesGelatoSelfieReportError).count { it }
}

/**
 * Details on the verification error. Present when status is `unverified`.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/gelato_selfie_report/properties/error
 */
@Serializable(with = InlineGelatoSelfieReportErrorX46da4547.Serializer::class)
public class InlineGelatoSelfieReportErrorX46da4547 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineGelatoSelfieReportErrorX46da4547Inspection,
) {
  public val gelatoSelfieReportError: GelatoSelfieReportErrorView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesGelatoSelfieReportError) json.decodeFromJsonElement<GelatoSelfieReportErrorView>(raw) else null }

  public val matchedBranches: Set<InlineGelatoSelfieReportErrorX46da4547Branch>
    get() = buildSet {
      if (inspection.matchesGelatoSelfieReportError) add(InlineGelatoSelfieReportErrorX46da4547Branch.GelatoSelfieReportError)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineGelatoSelfieReportErrorX46da4547 {
      val inspection = inspectInlineGelatoSelfieReportErrorX46da4547(raw)
      if (inspection.matchCount == 0) {
        throw InlineGelatoSelfieReportErrorX46da4547NoMatchException("InlineGelatoSelfieReportErrorX46da4547 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineGelatoSelfieReportErrorX46da4547(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineGelatoSelfieReportErrorX46da4547> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineGelatoSelfieReportErrorX46da4547 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineGelatoSelfieReportErrorX46da4547")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineGelatoSelfieReportErrorX46da4547) {
      encoder.requireJsonEncoder("InlineGelatoSelfieReportErrorX46da4547").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineGelatoSelfieReportErrorX46da4547(element: JsonElement): InlineGelatoSelfieReportErrorX46da4547Inspection {
  val raw = element as? JsonObject ?: return InlineGelatoSelfieReportErrorX46da4547Inspection(
    matchesGelatoSelfieReportError = false,
    failures = listOf("GelatoSelfieReportError: expected JSON object"),
  )
  val matchesGelatoSelfieReportError = true
  return InlineGelatoSelfieReportErrorX46da4547Inspection(
    matchesGelatoSelfieReportError = matchesGelatoSelfieReportError,
    failures = buildList {
      if (!matchesGelatoSelfieReportError) add("GelatoSelfieReportError: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
