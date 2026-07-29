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

public enum class InlineCustomerTestClockX4aeba957Branch {
  Branch1,
  TestHelpersTestClock,
}

public sealed class InlineCustomerTestClockX4aeba957DecodingException(
  message: String,
) : SerializationException(message)

public class InlineCustomerTestClockX4aeba957NoMatchException(
  message: String,
) : InlineCustomerTestClockX4aeba957DecodingException(message)

internal data class InlineCustomerTestClockX4aeba957Inspection(
  public val matchesBranch1: Boolean,
  public val matchesTestHelpersTestClock: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesTestHelpersTestClock).count { it }
}

/**
 * ID of the test clock that this customer belongs to.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/customer/properties/test_clock
 */
@Serializable(with = InlineCustomerTestClockX4aeba957.Serializer::class)
public class InlineCustomerTestClockX4aeba957 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineCustomerTestClockX4aeba957Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val testHelpersTestClock: TestHelpersTestClock? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesTestHelpersTestClock) json.decodeFromJsonElement<TestHelpersTestClock>(raw) else null }

  public val matchedBranches: Set<InlineCustomerTestClockX4aeba957Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineCustomerTestClockX4aeba957Branch.Branch1)
      if (inspection.matchesTestHelpersTestClock) add(InlineCustomerTestClockX4aeba957Branch.TestHelpersTestClock)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineCustomerTestClockX4aeba957 {
      val inspection = inspectInlineCustomerTestClockX4aeba957(raw)
      if (inspection.matchCount == 0) {
        throw InlineCustomerTestClockX4aeba957NoMatchException("InlineCustomerTestClockX4aeba957 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineCustomerTestClockX4aeba957(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineCustomerTestClockX4aeba957> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineCustomerTestClockX4aeba957 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineCustomerTestClockX4aeba957")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineCustomerTestClockX4aeba957) {
      encoder.requireJsonEncoder("InlineCustomerTestClockX4aeba957").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineCustomerTestClockX4aeba957(element: JsonElement): InlineCustomerTestClockX4aeba957Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesTestHelpersTestClock = element.isJsonDecodable<TestHelpersTestClock>()
  return InlineCustomerTestClockX4aeba957Inspection(
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
