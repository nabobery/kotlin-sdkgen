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

public enum class InlineSetupAttemptSetupErrorXedd0b9b5Branch {
  ApiErrors,
}

public sealed class InlineSetupAttemptSetupErrorXedd0b9b5DecodingException(
  message: String,
) : SerializationException(message)

public class InlineSetupAttemptSetupErrorXedd0b9b5NoMatchException(
  message: String,
) : InlineSetupAttemptSetupErrorXedd0b9b5DecodingException(message)

internal data class InlineSetupAttemptSetupErrorXedd0b9b5Inspection(
  public val matchesApiErrors: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesApiErrors).count { it }
}

/**
 * The error encountered during this attempt to confirm the SetupIntent, if any.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/setup_attempt/properties/setup_error
 */
@Serializable(with = InlineSetupAttemptSetupErrorXedd0b9b5.Serializer::class)
public class InlineSetupAttemptSetupErrorXedd0b9b5 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineSetupAttemptSetupErrorXedd0b9b5Inspection,
) {
  public val apiErrors: ApiErrorsView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesApiErrors) json.decodeFromJsonElement<ApiErrorsView>(raw) else null }

  public val matchedBranches: Set<InlineSetupAttemptSetupErrorXedd0b9b5Branch>
    get() = buildSet {
      if (inspection.matchesApiErrors) add(InlineSetupAttemptSetupErrorXedd0b9b5Branch.ApiErrors)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineSetupAttemptSetupErrorXedd0b9b5 {
      val inspection = inspectInlineSetupAttemptSetupErrorXedd0b9b5(raw)
      if (inspection.matchCount == 0) {
        throw InlineSetupAttemptSetupErrorXedd0b9b5NoMatchException("InlineSetupAttemptSetupErrorXedd0b9b5 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineSetupAttemptSetupErrorXedd0b9b5(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineSetupAttemptSetupErrorXedd0b9b5> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineSetupAttemptSetupErrorXedd0b9b5 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineSetupAttemptSetupErrorXedd0b9b5")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineSetupAttemptSetupErrorXedd0b9b5) {
      encoder.requireJsonEncoder("InlineSetupAttemptSetupErrorXedd0b9b5").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineSetupAttemptSetupErrorXedd0b9b5(element: JsonElement): InlineSetupAttemptSetupErrorXedd0b9b5Inspection {
  val raw = element as? JsonObject ?: return InlineSetupAttemptSetupErrorXedd0b9b5Inspection(
    matchesApiErrors = false,
    failures = listOf("ApiErrors: expected JSON object"),
  )
  val matchesApiErrors = raw["type"] != null
  return InlineSetupAttemptSetupErrorXedd0b9b5Inspection(
    matchesApiErrors = matchesApiErrors,
    failures = buildList {
      if (!matchesApiErrors) add("ApiErrors: required properties 'type' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
