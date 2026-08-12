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

public enum class InlineSubscriptionScheduleTestClockX22d9a61aBranch {
  Branch1,
  TestHelpersTestClock,
}

public sealed class InlineSubscriptionScheduleTestClockX22d9a61aDecodingException(
  message: String,
) : SerializationException(message)

public class InlineSubscriptionScheduleTestClockX22d9a61aNoMatchException(
  message: String,
) : InlineSubscriptionScheduleTestClockX22d9a61aDecodingException(message)

internal data class InlineSubscriptionScheduleTestClockX22d9a61aInspection(
  public val matchesBranch1: Boolean,
  public val matchesTestHelpersTestClock: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesTestHelpersTestClock).count { it }
}

/**
 * ID of the test clock this subscription schedule belongs to.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/subscription_schedule/properties/test_clock
 */
@Serializable(with = InlineSubscriptionScheduleTestClockX22d9a61a.Serializer::class)
public class InlineSubscriptionScheduleTestClockX22d9a61a internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineSubscriptionScheduleTestClockX22d9a61aInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val testHelpersTestClock: TestHelpersTestClock? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesTestHelpersTestClock) json.decodeFromJsonElement<TestHelpersTestClock>(raw) else null }

  public val matchedBranches: Set<InlineSubscriptionScheduleTestClockX22d9a61aBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineSubscriptionScheduleTestClockX22d9a61aBranch.Branch1)
      if (inspection.matchesTestHelpersTestClock) add(InlineSubscriptionScheduleTestClockX22d9a61aBranch.TestHelpersTestClock)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineSubscriptionScheduleTestClockX22d9a61a {
      val inspection = inspectInlineSubscriptionScheduleTestClockX22d9a61a(raw)
      if (inspection.matchCount == 0) {
        throw InlineSubscriptionScheduleTestClockX22d9a61aNoMatchException("InlineSubscriptionScheduleTestClockX22d9a61a matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineSubscriptionScheduleTestClockX22d9a61a(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineSubscriptionScheduleTestClockX22d9a61a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineSubscriptionScheduleTestClockX22d9a61a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineSubscriptionScheduleTestClockX22d9a61a")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineSubscriptionScheduleTestClockX22d9a61a) {
      encoder.requireJsonEncoder("InlineSubscriptionScheduleTestClockX22d9a61a").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineSubscriptionScheduleTestClockX22d9a61a(element: JsonElement): InlineSubscriptionScheduleTestClockX22d9a61aInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesTestHelpersTestClock = element.isJsonDecodable<TestHelpersTestClock>()
  return InlineSubscriptionScheduleTestClockX22d9a61aInspection(
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
