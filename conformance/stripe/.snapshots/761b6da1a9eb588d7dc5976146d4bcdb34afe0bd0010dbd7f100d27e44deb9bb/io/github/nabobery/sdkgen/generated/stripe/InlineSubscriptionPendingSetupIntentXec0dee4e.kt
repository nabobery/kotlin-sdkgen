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

public enum class InlineSubscriptionPendingSetupIntentXec0dee4eBranch {
  Branch1,
  SetupIntent,
}

public sealed class InlineSubscriptionPendingSetupIntentXec0dee4eDecodingException(
  message: String,
) : SerializationException(message)

public class InlineSubscriptionPendingSetupIntentXec0dee4eNoMatchException(
  message: String,
) : InlineSubscriptionPendingSetupIntentXec0dee4eDecodingException(message)

internal data class InlineSubscriptionPendingSetupIntentXec0dee4eInspection(
  public val matchesBranch1: Boolean,
  public val matchesSetupIntent: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesSetupIntent).count { it }
}

/**
 * You can use this [SetupIntent](https://docs.stripe.com/api/setup_intents) to collect user authentication when
 * creating a subscription without immediate payment or updating a subscription's payment method, allowing you to
 * optimize for off-session payments. Learn more in the [SCA Migration
 * Guide](https://docs.stripe.com/billing/migration/strong-customer-authentication#scenario-2).
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/subscription/properties/pending_setup_intent
 */
@Serializable(with = InlineSubscriptionPendingSetupIntentXec0dee4e.Serializer::class)
public class InlineSubscriptionPendingSetupIntentXec0dee4e internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineSubscriptionPendingSetupIntentXec0dee4eInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val setupIntent: SetupIntent? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesSetupIntent) json.decodeFromJsonElement<SetupIntent>(raw) else null }

  public val matchedBranches: Set<InlineSubscriptionPendingSetupIntentXec0dee4eBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineSubscriptionPendingSetupIntentXec0dee4eBranch.Branch1)
      if (inspection.matchesSetupIntent) add(InlineSubscriptionPendingSetupIntentXec0dee4eBranch.SetupIntent)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineSubscriptionPendingSetupIntentXec0dee4e {
      val inspection = inspectInlineSubscriptionPendingSetupIntentXec0dee4e(raw)
      if (inspection.matchCount == 0) {
        throw InlineSubscriptionPendingSetupIntentXec0dee4eNoMatchException("InlineSubscriptionPendingSetupIntentXec0dee4e matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineSubscriptionPendingSetupIntentXec0dee4e(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineSubscriptionPendingSetupIntentXec0dee4e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineSubscriptionPendingSetupIntentXec0dee4e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineSubscriptionPendingSetupIntentXec0dee4e")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineSubscriptionPendingSetupIntentXec0dee4e) {
      encoder.requireJsonEncoder("InlineSubscriptionPendingSetupIntentXec0dee4e").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineSubscriptionPendingSetupIntentXec0dee4e(element: JsonElement): InlineSubscriptionPendingSetupIntentXec0dee4eInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesSetupIntent = element.isJsonDecodable<SetupIntent>()
  return InlineSubscriptionPendingSetupIntentXec0dee4eInspection(
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
