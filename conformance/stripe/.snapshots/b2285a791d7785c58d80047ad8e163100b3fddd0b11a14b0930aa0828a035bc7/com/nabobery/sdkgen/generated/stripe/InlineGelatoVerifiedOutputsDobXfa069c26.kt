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

public enum class InlineGelatoVerifiedOutputsDobXfa069c26Branch {
  GelatoDataVerifiedOutputsDate,
}

public sealed class InlineGelatoVerifiedOutputsDobXfa069c26DecodingException(
  message: String,
) : SerializationException(message)

public class InlineGelatoVerifiedOutputsDobXfa069c26NoMatchException(
  message: String,
) : InlineGelatoVerifiedOutputsDobXfa069c26DecodingException(message)

internal data class InlineGelatoVerifiedOutputsDobXfa069c26Inspection(
  public val matchesGelatoDataVerifiedOutputsDate: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesGelatoDataVerifiedOutputsDate).count { it }
}

/**
 * The user’s verified date of birth.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/gelato_verified_outputs/properties/dob
 */
@Serializable(with = InlineGelatoVerifiedOutputsDobXfa069c26.Serializer::class)
public class InlineGelatoVerifiedOutputsDobXfa069c26 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineGelatoVerifiedOutputsDobXfa069c26Inspection,
) {
  public val gelatoDataVerifiedOutputsDate: GelatoDataVerifiedOutputsDateView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesGelatoDataVerifiedOutputsDate) json.decodeFromJsonElement<GelatoDataVerifiedOutputsDateView>(raw) else null }

  public val matchedBranches: Set<InlineGelatoVerifiedOutputsDobXfa069c26Branch>
    get() = buildSet {
      if (inspection.matchesGelatoDataVerifiedOutputsDate) add(InlineGelatoVerifiedOutputsDobXfa069c26Branch.GelatoDataVerifiedOutputsDate)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineGelatoVerifiedOutputsDobXfa069c26 {
      val inspection = inspectInlineGelatoVerifiedOutputsDobXfa069c26(raw)
      if (inspection.matchCount == 0) {
        throw InlineGelatoVerifiedOutputsDobXfa069c26NoMatchException("InlineGelatoVerifiedOutputsDobXfa069c26 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineGelatoVerifiedOutputsDobXfa069c26(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineGelatoVerifiedOutputsDobXfa069c26> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineGelatoVerifiedOutputsDobXfa069c26 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineGelatoVerifiedOutputsDobXfa069c26")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineGelatoVerifiedOutputsDobXfa069c26) {
      encoder.requireJsonEncoder("InlineGelatoVerifiedOutputsDobXfa069c26").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineGelatoVerifiedOutputsDobXfa069c26(element: JsonElement): InlineGelatoVerifiedOutputsDobXfa069c26Inspection {
  val raw = element as? JsonObject ?: return InlineGelatoVerifiedOutputsDobXfa069c26Inspection(
    matchesGelatoDataVerifiedOutputsDate = false,
    failures = listOf("GelatoDataVerifiedOutputsDate: expected JSON object"),
  )
  val matchesGelatoDataVerifiedOutputsDate = true
  return InlineGelatoVerifiedOutputsDobXfa069c26Inspection(
    matchesGelatoDataVerifiedOutputsDate = matchesGelatoDataVerifiedOutputsDate,
    failures = buildList {
      if (!matchesGelatoDataVerifiedOutputsDate) add("GelatoDataVerifiedOutputsDate: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
