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

public enum class InlineSetupIntentLatestAttemptXa0b1ef17Branch {
  Branch1,
  SetupAttempt,
}

public sealed class InlineSetupIntentLatestAttemptXa0b1ef17DecodingException(
  message: String,
) : SerializationException(message)

public class InlineSetupIntentLatestAttemptXa0b1ef17NoMatchException(
  message: String,
) : InlineSetupIntentLatestAttemptXa0b1ef17DecodingException(message)

internal data class InlineSetupIntentLatestAttemptXa0b1ef17Inspection(
  public val matchesBranch1: Boolean,
  public val matchesSetupAttempt: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesSetupAttempt).count { it }
}

/**
 * The most recent SetupAttempt for this SetupIntent.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/setup_intent/properties/latest_attempt
 */
@Serializable(with = InlineSetupIntentLatestAttemptXa0b1ef17.Serializer::class)
public class InlineSetupIntentLatestAttemptXa0b1ef17 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineSetupIntentLatestAttemptXa0b1ef17Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val setupAttempt: SetupAttempt? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesSetupAttempt) json.decodeFromJsonElement<SetupAttempt>(raw) else null }

  public val matchedBranches: Set<InlineSetupIntentLatestAttemptXa0b1ef17Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineSetupIntentLatestAttemptXa0b1ef17Branch.Branch1)
      if (inspection.matchesSetupAttempt) add(InlineSetupIntentLatestAttemptXa0b1ef17Branch.SetupAttempt)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineSetupIntentLatestAttemptXa0b1ef17 {
      val inspection = inspectInlineSetupIntentLatestAttemptXa0b1ef17(raw)
      if (inspection.matchCount == 0) {
        throw InlineSetupIntentLatestAttemptXa0b1ef17NoMatchException("InlineSetupIntentLatestAttemptXa0b1ef17 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineSetupIntentLatestAttemptXa0b1ef17(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineSetupIntentLatestAttemptXa0b1ef17> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineSetupIntentLatestAttemptXa0b1ef17 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineSetupIntentLatestAttemptXa0b1ef17")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineSetupIntentLatestAttemptXa0b1ef17) {
      encoder.requireJsonEncoder("InlineSetupIntentLatestAttemptXa0b1ef17").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineSetupIntentLatestAttemptXa0b1ef17(element: JsonElement): InlineSetupIntentLatestAttemptXa0b1ef17Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesSetupAttempt = element.isJsonDecodable<SetupAttempt>()
  return InlineSetupIntentLatestAttemptXa0b1ef17Inspection(
    matchesBranch1 = matchesBranch1,
    matchesSetupAttempt = matchesSetupAttempt,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesSetupAttempt) add("SetupAttempt: value does not match SetupAttempt")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
