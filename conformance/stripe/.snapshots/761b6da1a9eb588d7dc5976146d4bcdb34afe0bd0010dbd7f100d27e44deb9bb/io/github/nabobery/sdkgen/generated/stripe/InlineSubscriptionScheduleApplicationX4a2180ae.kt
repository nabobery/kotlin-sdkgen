package io.github.nabobery.sdkgen.generated.stripe

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

public enum class InlineSubscriptionScheduleApplicationX4a2180aeBranch {
  Branch1,
  Application,
  DeletedApplication,
}

public sealed class InlineSubscriptionScheduleApplicationX4a2180aeDecodingException(
  message: String,
) : SerializationException(message)

public class InlineSubscriptionScheduleApplicationX4a2180aeNoMatchException(
  message: String,
) : InlineSubscriptionScheduleApplicationX4a2180aeDecodingException(message)

internal data class InlineSubscriptionScheduleApplicationX4a2180aeInspection(
  public val matchesBranch1: Boolean,
  public val matchesApplication: Boolean,
  public val matchesDeletedApplication: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesApplication, matchesDeletedApplication).count { it }
}

/**
 * ID of the Connect Application that created the schedule.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/subscription_schedule/properties/application
 */
@Serializable(with = InlineSubscriptionScheduleApplicationX4a2180ae.Serializer::class)
public class InlineSubscriptionScheduleApplicationX4a2180ae internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineSubscriptionScheduleApplicationX4a2180aeInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val application: Application? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesApplication) json.decodeFromJsonElement<Application>(raw) else null }

  public val deletedApplication: DeletedApplication? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesDeletedApplication) json.decodeFromJsonElement<DeletedApplication>(raw) else null }

  public val matchedBranches: Set<InlineSubscriptionScheduleApplicationX4a2180aeBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineSubscriptionScheduleApplicationX4a2180aeBranch.Branch1)
      if (inspection.matchesApplication) add(InlineSubscriptionScheduleApplicationX4a2180aeBranch.Application)
      if (inspection.matchesDeletedApplication) add(InlineSubscriptionScheduleApplicationX4a2180aeBranch.DeletedApplication)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineSubscriptionScheduleApplicationX4a2180ae {
      val inspection = inspectInlineSubscriptionScheduleApplicationX4a2180ae(raw)
      if (inspection.matchCount == 0) {
        throw InlineSubscriptionScheduleApplicationX4a2180aeNoMatchException("InlineSubscriptionScheduleApplicationX4a2180ae matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineSubscriptionScheduleApplicationX4a2180ae(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineSubscriptionScheduleApplicationX4a2180ae> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineSubscriptionScheduleApplicationX4a2180ae {
      val jsonDecoder = decoder.requireJsonDecoder("InlineSubscriptionScheduleApplicationX4a2180ae")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineSubscriptionScheduleApplicationX4a2180ae) {
      encoder.requireJsonEncoder("InlineSubscriptionScheduleApplicationX4a2180ae").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineSubscriptionScheduleApplicationX4a2180ae(element: JsonElement): InlineSubscriptionScheduleApplicationX4a2180aeInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesApplication = element.isJsonDecodable<Application>()
  val matchesDeletedApplication = element.isJsonDecodable<DeletedApplication>()
  return InlineSubscriptionScheduleApplicationX4a2180aeInspection(
    matchesBranch1 = matchesBranch1,
    matchesApplication = matchesApplication,
    matchesDeletedApplication = matchesDeletedApplication,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesApplication) add("Application: value does not match Application")
      if (!matchesDeletedApplication) add("DeletedApplication: value does not match DeletedApplication")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
