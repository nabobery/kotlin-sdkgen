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

public enum class InlineTerminalReaderReaderResourceReaderActionApiErrorXadd9eaddBranch {
  ApiErrors,
}

public sealed class InlineTerminalReaderReaderResourceReaderActionApiErrorXadd9eaddDecodingException(
  message: String,
) : SerializationException(message)

public class InlineTerminalReaderReaderResourceReaderActionApiErrorXadd9eaddNoMatchException(
  message: String,
) : InlineTerminalReaderReaderResourceReaderActionApiErrorXadd9eaddDecodingException(message)

internal data class InlineTerminalReaderReaderResourceReaderActionApiErrorXadd9eaddInspection(
  public val matchesApiErrors: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesApiErrors).count { it }
}

/**
 * The reader action failed due to an [API error](https://docs.stripe.com/api/errors). Only present when `status` is
 * `failed` and the underlying failure was an API error. Avoid parsing the `message` field for programmatic logic; use
 * `type` or `code` instead. The `message` field is for display to humans only and may be updated at anytime. Requires
 * [reader version](https://docs.stripe.com/terminal/readers/stripe-reader-s700-s710#reader-software-version) 2.42 or
 * later. Readers on older versions always return null.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/terminal_reader_reader_resource_reader_action/properties/api_error
 */
@Serializable(with = InlineTerminalReaderReaderResourceReaderActionApiErrorXadd9eadd.Serializer::class)
public class InlineTerminalReaderReaderResourceReaderActionApiErrorXadd9eadd internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineTerminalReaderReaderResourceReaderActionApiErrorXadd9eaddInspection,
) {
  public val apiErrors: ApiErrorsView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesApiErrors) json.decodeFromJsonElement<ApiErrorsView>(raw) else null }

  public val matchedBranches:
      Set<InlineTerminalReaderReaderResourceReaderActionApiErrorXadd9eaddBranch>
    get() = buildSet {
      if (inspection.matchesApiErrors) add(InlineTerminalReaderReaderResourceReaderActionApiErrorXadd9eaddBranch.ApiErrors)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineTerminalReaderReaderResourceReaderActionApiErrorXadd9eadd {
      val inspection = inspectInlineTerminalReaderReaderResourceReaderActionApiErrorXadd9eadd(raw)
      if (inspection.matchCount == 0) {
        throw InlineTerminalReaderReaderResourceReaderActionApiErrorXadd9eaddNoMatchException("InlineTerminalReaderReaderResourceReaderActionApiErrorXadd9eadd matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineTerminalReaderReaderResourceReaderActionApiErrorXadd9eadd(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineTerminalReaderReaderResourceReaderActionApiErrorXadd9eadd> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineTerminalReaderReaderResourceReaderActionApiErrorXadd9eadd {
      val jsonDecoder = decoder.requireJsonDecoder("InlineTerminalReaderReaderResourceReaderActionApiErrorXadd9eadd")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineTerminalReaderReaderResourceReaderActionApiErrorXadd9eadd) {
      encoder.requireJsonEncoder("InlineTerminalReaderReaderResourceReaderActionApiErrorXadd9eadd").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineTerminalReaderReaderResourceReaderActionApiErrorXadd9eadd(element: JsonElement): InlineTerminalReaderReaderResourceReaderActionApiErrorXadd9eaddInspection {
  val raw = element as? JsonObject ?: return InlineTerminalReaderReaderResourceReaderActionApiErrorXadd9eaddInspection(
    matchesApiErrors = false,
    failures = listOf("ApiErrors: expected JSON object"),
  )
  val matchesApiErrors = raw["type"] != null
  return InlineTerminalReaderReaderResourceReaderActionApiErrorXadd9eaddInspection(
    matchesApiErrors = matchesApiErrors,
    failures = buildList {
      if (!matchesApiErrors) add("ApiErrors: required properties 'type' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
