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

public enum class InlineGelatoIdNumberReportErrorX4ba663b0Branch {
  GelatoIdNumberReportError,
}

public sealed class InlineGelatoIdNumberReportErrorX4ba663b0DecodingException(
  message: String,
) : SerializationException(message)

public class InlineGelatoIdNumberReportErrorX4ba663b0NoMatchException(
  message: String,
) : InlineGelatoIdNumberReportErrorX4ba663b0DecodingException(message)

internal data class InlineGelatoIdNumberReportErrorX4ba663b0Inspection(
  public val matchesGelatoIdNumberReportError: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesGelatoIdNumberReportError).count { it }
}

/**
 * Details on the verification error. Present when status is `unverified`.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/gelato_id_number_report/properties/error
 */
@Serializable(with = InlineGelatoIdNumberReportErrorX4ba663b0.Serializer::class)
public class InlineGelatoIdNumberReportErrorX4ba663b0 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineGelatoIdNumberReportErrorX4ba663b0Inspection,
) {
  public val gelatoIdNumberReportError: GelatoIdNumberReportErrorView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesGelatoIdNumberReportError) json.decodeFromJsonElement<GelatoIdNumberReportErrorView>(raw) else null }

  public val matchedBranches: Set<InlineGelatoIdNumberReportErrorX4ba663b0Branch>
    get() = buildSet {
      if (inspection.matchesGelatoIdNumberReportError) add(InlineGelatoIdNumberReportErrorX4ba663b0Branch.GelatoIdNumberReportError)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineGelatoIdNumberReportErrorX4ba663b0 {
      val inspection = inspectInlineGelatoIdNumberReportErrorX4ba663b0(raw)
      if (inspection.matchCount == 0) {
        throw InlineGelatoIdNumberReportErrorX4ba663b0NoMatchException("InlineGelatoIdNumberReportErrorX4ba663b0 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineGelatoIdNumberReportErrorX4ba663b0(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineGelatoIdNumberReportErrorX4ba663b0> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineGelatoIdNumberReportErrorX4ba663b0 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineGelatoIdNumberReportErrorX4ba663b0")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineGelatoIdNumberReportErrorX4ba663b0) {
      encoder.requireJsonEncoder("InlineGelatoIdNumberReportErrorX4ba663b0").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineGelatoIdNumberReportErrorX4ba663b0(element: JsonElement): InlineGelatoIdNumberReportErrorX4ba663b0Inspection {
  val raw = element as? JsonObject ?: return InlineGelatoIdNumberReportErrorX4ba663b0Inspection(
    matchesGelatoIdNumberReportError = false,
    failures = listOf("GelatoIdNumberReportError: expected JSON object"),
  )
  val matchesGelatoIdNumberReportError = true
  return InlineGelatoIdNumberReportErrorX4ba663b0Inspection(
    matchesGelatoIdNumberReportError = matchesGelatoIdNumberReportError,
    failures = buildList {
      if (!matchesGelatoIdNumberReportError) add("GelatoIdNumberReportError: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
