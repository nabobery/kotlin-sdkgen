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

public enum class InlineQuoteTestClockXf70c6291Branch {
  Branch1,
  TestHelpersTestClock,
}

public sealed class InlineQuoteTestClockXf70c6291DecodingException(
  message: String,
) : SerializationException(message)

public class InlineQuoteTestClockXf70c6291NoMatchException(
  message: String,
) : InlineQuoteTestClockXf70c6291DecodingException(message)

internal data class InlineQuoteTestClockXf70c6291Inspection(
  public val matchesBranch1: Boolean,
  public val matchesTestHelpersTestClock: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesTestHelpersTestClock).count { it }
}

/**
 * ID of the test clock this quote belongs to.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/quote/properties/test_clock
 */
@Serializable(with = InlineQuoteTestClockXf70c6291.Serializer::class)
public class InlineQuoteTestClockXf70c6291 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineQuoteTestClockXf70c6291Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val testHelpersTestClock: TestHelpersTestClock? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesTestHelpersTestClock) json.decodeFromJsonElement<TestHelpersTestClock>(raw) else null }

  public val matchedBranches: Set<InlineQuoteTestClockXf70c6291Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineQuoteTestClockXf70c6291Branch.Branch1)
      if (inspection.matchesTestHelpersTestClock) add(InlineQuoteTestClockXf70c6291Branch.TestHelpersTestClock)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineQuoteTestClockXf70c6291 {
      val inspection = inspectInlineQuoteTestClockXf70c6291(raw)
      if (inspection.matchCount == 0) {
        throw InlineQuoteTestClockXf70c6291NoMatchException("InlineQuoteTestClockXf70c6291 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineQuoteTestClockXf70c6291(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineQuoteTestClockXf70c6291> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineQuoteTestClockXf70c6291 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineQuoteTestClockXf70c6291")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineQuoteTestClockXf70c6291) {
      encoder.requireJsonEncoder("InlineQuoteTestClockXf70c6291").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineQuoteTestClockXf70c6291(element: JsonElement): InlineQuoteTestClockXf70c6291Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesTestHelpersTestClock = element.isJsonDecodable<TestHelpersTestClock>()
  return InlineQuoteTestClockXf70c6291Inspection(
    matchesBranch1 = matchesBranch1,
    matchesTestHelpersTestClock = matchesTestHelpersTestClock,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesTestHelpersTestClock) add("TestHelpersTestClock: value does not match TestHelpersTestClock")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
