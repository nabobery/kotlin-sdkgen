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

public enum class InlineSetupAttemptSetupIntentX315ddd4fBranch {
  Branch1,
  SetupIntent,
}

public sealed class InlineSetupAttemptSetupIntentX315ddd4fDecodingException(
  message: String,
) : SerializationException(message)

public class InlineSetupAttemptSetupIntentX315ddd4fNoMatchException(
  message: String,
) : InlineSetupAttemptSetupIntentX315ddd4fDecodingException(message)

internal data class InlineSetupAttemptSetupIntentX315ddd4fInspection(
  public val matchesBranch1: Boolean,
  public val matchesSetupIntent: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesSetupIntent).count { it }
}

/**
 * ID of the SetupIntent that this attempt belongs to.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/setup_attempt/properties/setup_intent
 */
@Serializable(with = InlineSetupAttemptSetupIntentX315ddd4f.Serializer::class)
public class InlineSetupAttemptSetupIntentX315ddd4f internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineSetupAttemptSetupIntentX315ddd4fInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val setupIntent: SetupIntent? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesSetupIntent) json.decodeFromJsonElement<SetupIntent>(raw) else null }

  public val matchedBranches: Set<InlineSetupAttemptSetupIntentX315ddd4fBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineSetupAttemptSetupIntentX315ddd4fBranch.Branch1)
      if (inspection.matchesSetupIntent) add(InlineSetupAttemptSetupIntentX315ddd4fBranch.SetupIntent)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineSetupAttemptSetupIntentX315ddd4f {
      val inspection = inspectInlineSetupAttemptSetupIntentX315ddd4f(raw)
      if (inspection.matchCount == 0) {
        throw InlineSetupAttemptSetupIntentX315ddd4fNoMatchException("InlineSetupAttemptSetupIntentX315ddd4f matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineSetupAttemptSetupIntentX315ddd4f(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineSetupAttemptSetupIntentX315ddd4f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineSetupAttemptSetupIntentX315ddd4f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineSetupAttemptSetupIntentX315ddd4f")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineSetupAttemptSetupIntentX315ddd4f) {
      encoder.requireJsonEncoder("InlineSetupAttemptSetupIntentX315ddd4f").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineSetupAttemptSetupIntentX315ddd4f(element: JsonElement): InlineSetupAttemptSetupIntentX315ddd4fInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesSetupIntent = element.isJsonDecodable<SetupIntent>()
  return InlineSetupAttemptSetupIntentX315ddd4fInspection(
    matchesBranch1 = matchesBranch1,
    matchesSetupIntent = matchesSetupIntent,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesSetupIntent) add("SetupIntent: value does not match SetupIntent")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
