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

public enum class InlineSetupAttemptApplicationXaec8dc26Branch {
  Branch1,
  Application,
}

public sealed class InlineSetupAttemptApplicationXaec8dc26DecodingException(
  message: String,
) : SerializationException(message)

public class InlineSetupAttemptApplicationXaec8dc26NoMatchException(
  message: String,
) : InlineSetupAttemptApplicationXaec8dc26DecodingException(message)

internal data class InlineSetupAttemptApplicationXaec8dc26Inspection(
  public val matchesBranch1: Boolean,
  public val matchesApplication: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesApplication).count { it }
}

/**
 * The value of [application](https://docs.stripe.com/api/setup_intents/object#setup_intent_object-application) on the
 * SetupIntent at the time of this confirmation.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/setup_attempt/properties/application
 */
@Serializable(with = InlineSetupAttemptApplicationXaec8dc26.Serializer::class)
public class InlineSetupAttemptApplicationXaec8dc26 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineSetupAttemptApplicationXaec8dc26Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val application: Application? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesApplication) json.decodeFromJsonElement<Application>(raw) else null }

  public val matchedBranches: Set<InlineSetupAttemptApplicationXaec8dc26Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineSetupAttemptApplicationXaec8dc26Branch.Branch1)
      if (inspection.matchesApplication) add(InlineSetupAttemptApplicationXaec8dc26Branch.Application)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineSetupAttemptApplicationXaec8dc26 {
      val inspection = inspectInlineSetupAttemptApplicationXaec8dc26(raw)
      if (inspection.matchCount == 0) {
        throw InlineSetupAttemptApplicationXaec8dc26NoMatchException("InlineSetupAttemptApplicationXaec8dc26 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineSetupAttemptApplicationXaec8dc26(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineSetupAttemptApplicationXaec8dc26> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineSetupAttemptApplicationXaec8dc26 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineSetupAttemptApplicationXaec8dc26")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineSetupAttemptApplicationXaec8dc26) {
      encoder.requireJsonEncoder("InlineSetupAttemptApplicationXaec8dc26").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineSetupAttemptApplicationXaec8dc26(element: JsonElement): InlineSetupAttemptApplicationXaec8dc26Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesApplication = element.isJsonDecodable<Application>()
  return InlineSetupAttemptApplicationXaec8dc26Inspection(
    matchesBranch1 = matchesBranch1,
    matchesApplication = matchesApplication,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesApplication) add("Application: value does not match Application")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
