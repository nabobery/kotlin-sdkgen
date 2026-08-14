package io.github.nabobery.sdkgen.github.generated

import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonObjectBuilder
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/webhooks_sponsorship.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhooks_sponsorship
 */
@Serializable(with = WebhooksSponsorship.Serializer::class)
public class WebhooksSponsorship internal constructor(
  public val createdAt: String,
  public val nodeId: String,
  public val privacyLevel: String,
  public val sponsor: InlineWebhooksSponsorshipSponsorX08503003?,
  public val sponsorable: InlineWebhooksSponsorshipSponsorableX373093d2?,
  /**
   * The `tier_changed` and `pending_tier_change` will include the original tier before the change or pending change.
   * For more information, see the pending tier change payload.
   */
  public val tier: InlineWebhooksSponsorshipTierXaa6d63aa,
  private val maintainerState: FieldState<InlineWebhooksSponsorshipMaintainerX086c55cb>,
) {
  public val maintainer: InlineWebhooksSponsorshipMaintainerX086c55cb?
    get() = maintainerState.valueOrNull()

  public constructor(
    createdAt: String,
    nodeId: String,
    privacyLevel: String,
    sponsor: InlineWebhooksSponsorshipSponsorX08503003?,
    sponsorable: InlineWebhooksSponsorshipSponsorableX373093d2?,
    tier: InlineWebhooksSponsorshipTierXaa6d63aa,
  ) : this(createdAt = createdAt,
  nodeId = nodeId,
  privacyLevel = privacyLevel,
  sponsor = sponsor,
  sponsorable = sponsorable,
  tier = tier,
  maintainerState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `maintainer`.
   */
  public fun maintainerPresence(): FieldPresence = maintainerState.presence

  public class Builder {
    private var createdAtValue: String? = null

    public var createdAt: String
      get() = requireNotNull(createdAtValue) { "createdAt is required" }
      set(`value`) {
        createdAtValue = value
      }

    private var nodeIdValue: String? = null

    public var nodeId: String
      get() = requireNotNull(nodeIdValue) { "nodeId is required" }
      set(`value`) {
        nodeIdValue = value
      }

    private var privacyLevelValue: String? = null

    public var privacyLevel: String
      get() = requireNotNull(privacyLevelValue) { "privacyLevel is required" }
      set(`value`) {
        privacyLevelValue = value
      }

    private var tierValue: InlineWebhooksSponsorshipTierXaa6d63aa? = null

    public var tier: InlineWebhooksSponsorshipTierXaa6d63aa
      get() = requireNotNull(tierValue) { "tier is required" }
      set(`value`) {
        tierValue = value
      }

    private var sponsorState: FieldState<InlineWebhooksSponsorshipSponsorX08503003?> =
        FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var sponsor: InlineWebhooksSponsorshipSponsorX08503003?
      get() = sponsorState.valueOrNull()
      set(`value`) {
        sponsorState = value.toNullableFieldState()
      }

    private var sponsorableState: FieldState<InlineWebhooksSponsorshipSponsorableX373093d2?> =
        FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var sponsorable: InlineWebhooksSponsorshipSponsorableX373093d2?
      get() = sponsorableState.valueOrNull()
      set(`value`) {
        sponsorableState = value.toNullableFieldState()
      }

    private var maintainerState: FieldState<InlineWebhooksSponsorshipMaintainerX086c55cb> =
        FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var maintainer: InlineWebhooksSponsorshipMaintainerX086c55cb?
      get() = maintainerState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "maintainer is not nullable; call unsetMaintainer() to omit it" }
        maintainerState = FieldState.Value(present)
      }

    /**
     * Omits `maintainer` from serialized output.
     */
    public fun unsetMaintainer() {
      maintainerState = FieldState.Absent
    }

    public fun build(): WebhooksSponsorship {
      check(createdAtValue != null) { "createdAt is required" }
      check(nodeIdValue != null) { "nodeId is required" }
      check(privacyLevelValue != null) { "privacyLevel is required" }
      check(tierValue != null) { "tier is required" }
      check(sponsorState !== FieldState.Absent) { "sponsor is required, even when null" }
      check(sponsorableState !== FieldState.Absent) { "sponsorable is required, even when null" }
      return WebhooksSponsorship(
        createdAt = createdAt,
        nodeId = nodeId,
        privacyLevel = privacyLevel,
        sponsor = sponsorState.valueOrNull(),
        sponsorable = sponsorableState.valueOrNull(),
        tier = tier,
        maintainerState = maintainerState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): WebhooksSponsorship = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<WebhooksSponsorship> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): WebhooksSponsorship {
      val jsonDecoder = decoder.requireJsonDecoder("WebhooksSponsorship")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("WebhooksSponsorship must be a JSON object")
      val createdAt = json.decodeRequired<String>(rawObject, "created_at")
      val nodeId = json.decodeRequired<String>(rawObject, "node_id")
      val privacyLevel = json.decodeRequired<String>(rawObject, "privacy_level")
      val tier = json.decodeRequired<InlineWebhooksSponsorshipTierXaa6d63aa>(rawObject, "tier")
      if (!rawObject.containsKey("sponsor")) {
        throw SerializationException("WebhooksSponsorship is missing required property 'sponsor'")
      }
      val sponsor = rawObject["sponsor"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineWebhooksSponsorshipSponsorX08503003?>(requireNotNull(element)) }
      if (!rawObject.containsKey("sponsorable")) {
        throw SerializationException("WebhooksSponsorship is missing required property 'sponsorable'")
      }
      val sponsorable = rawObject["sponsorable"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineWebhooksSponsorshipSponsorableX373093d2?>(requireNotNull(element)) }
      return WebhooksSponsorship(
        createdAt = createdAt,
        nodeId = nodeId,
        privacyLevel = privacyLevel,
        sponsor = sponsor,
        sponsorable = sponsorable,
        tier = tier,
        maintainerState = json.decodeOptional(rawObject, "maintainer", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: WebhooksSponsorship) {
      val jsonEncoder = encoder.requireJsonEncoder("WebhooksSponsorship")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("created_at", value.createdAt)
        put("node_id", value.nodeId)
        put("privacy_level", value.privacyLevel)
        put("sponsor", value.sponsor?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("sponsorable", value.sponsorable?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("tier", json.encodeToJsonElement(value.tier))
        putState("maintainer", value.maintainerState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun webhooksSponsorship(block: WebhooksSponsorship.Builder.() -> Unit): WebhooksSponsorship = WebhooksSponsorship.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("WebhooksSponsorship is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

private fun <T> T?.toNullableFieldState(): FieldState<T> = if (this == null) FieldState.Null else FieldState.Value(this)

private inline fun <reified T> Json.decodeOptional(
  raw: JsonObject,
  name: String,
  nullable: Boolean,
): FieldState<T> {
  if (!raw.containsKey(name)) return FieldState.Absent
  val element = requireNotNull(raw[name])
  if (element == JsonNull) {
    if (!nullable) throw SerializationException("WebhooksSponsorship property '" + name + "' is not nullable")
    return FieldState.Null
  }
  return FieldState.Value(decodeFromJsonElement<T>(element))
}

private inline fun <T> JsonObjectBuilder.putState(
  name: String,
  state: FieldState<T>,
  encode: (T) -> JsonElement,
) {
  when (state) {
    FieldState.Absent -> Unit
    FieldState.Null -> put(name, JsonNull)
    is FieldState.Value -> put(name, encode(state.value))
  }
}
