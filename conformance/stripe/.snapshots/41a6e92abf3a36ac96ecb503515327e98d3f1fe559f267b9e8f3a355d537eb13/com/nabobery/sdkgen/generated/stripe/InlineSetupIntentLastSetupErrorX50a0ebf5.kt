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

public enum class InlineSetupIntentLastSetupErrorX50a0ebf5Branch {
  ApiErrors,
}

public sealed class InlineSetupIntentLastSetupErrorX50a0ebf5DecodingException(
  message: String,
) : SerializationException(message)

public class InlineSetupIntentLastSetupErrorX50a0ebf5NoMatchException(
  message: String,
) : InlineSetupIntentLastSetupErrorX50a0ebf5DecodingException(message)

internal data class InlineSetupIntentLastSetupErrorX50a0ebf5Inspection(
  public val matchesApiErrors: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesApiErrors).count { it }
}

/**
 * The error encountered in the previous SetupIntent confirmation.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/setup_intent/properties/last_setup_error
 */
@Serializable(with = InlineSetupIntentLastSetupErrorX50a0ebf5.Serializer::class)
public class InlineSetupIntentLastSetupErrorX50a0ebf5 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineSetupIntentLastSetupErrorX50a0ebf5Inspection,
) {
  public val apiErrors: ApiErrorsView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesApiErrors) json.decodeFromJsonElement<ApiErrorsView>(raw) else null }

  public val matchedBranches: Set<InlineSetupIntentLastSetupErrorX50a0ebf5Branch>
    get() = buildSet {
      if (inspection.matchesApiErrors) add(InlineSetupIntentLastSetupErrorX50a0ebf5Branch.ApiErrors)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineSetupIntentLastSetupErrorX50a0ebf5 {
      val inspection = inspectInlineSetupIntentLastSetupErrorX50a0ebf5(raw)
      if (inspection.matchCount == 0) {
        throw InlineSetupIntentLastSetupErrorX50a0ebf5NoMatchException("InlineSetupIntentLastSetupErrorX50a0ebf5 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineSetupIntentLastSetupErrorX50a0ebf5(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineSetupIntentLastSetupErrorX50a0ebf5> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineSetupIntentLastSetupErrorX50a0ebf5 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineSetupIntentLastSetupErrorX50a0ebf5")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineSetupIntentLastSetupErrorX50a0ebf5) {
      encoder.requireJsonEncoder("InlineSetupIntentLastSetupErrorX50a0ebf5").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineSetupIntentLastSetupErrorX50a0ebf5(element: JsonElement): InlineSetupIntentLastSetupErrorX50a0ebf5Inspection {
  val raw = element as? JsonObject ?: return InlineSetupIntentLastSetupErrorX50a0ebf5Inspection(
    matchesApiErrors = false,
    failures = listOf("ApiErrors: expected JSON object"),
  )
  val matchesApiErrors = raw["type"] != null
  return InlineSetupIntentLastSetupErrorX50a0ebf5Inspection(
    matchesApiErrors = matchesApiErrors,
    failures = buildList {
      if (!matchesApiErrors) add("ApiErrors: required properties 'type' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
