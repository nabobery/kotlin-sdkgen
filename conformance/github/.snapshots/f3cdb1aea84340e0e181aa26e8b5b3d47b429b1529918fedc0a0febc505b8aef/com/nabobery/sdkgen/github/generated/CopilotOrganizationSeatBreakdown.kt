package com.nabobery.sdkgen.github.generated

import kotlin.Int
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * The breakdown of Copilot Business seats for the organization.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/copilot-organization-seat-breakdown
 */
@Serializable(with = CopilotOrganizationSeatBreakdown.Serializer::class)
public class CopilotOrganizationSeatBreakdown(
  /**
   * The number of seats that have used Copilot during the current billing cycle.
   */
  public val activeThisCycle: Int? = null,
  /**
   * Seats added during the current billing cycle.
   */
  public val addedThisCycle: Int? = null,
  /**
   * The number of seats that have not used Copilot during the current billing cycle.
   */
  public val inactiveThisCycle: Int? = null,
  /**
   * The number of seats that are pending cancellation at the end of the current billing cycle.
   */
  public val pendingCancellation: Int? = null,
  /**
   * The number of users who have been invited to receive a Copilot seat through this organization.
   */
  public val pendingInvitation: Int? = null,
  /**
   * The total number of seats being billed for the organization as of the current billing cycle.
   */
  public val total: Int? = null,
) {
  public class Builder {
    /**
     * The number of seats that have used Copilot during the current billing cycle.
     */
    public var activeThisCycle: Int? = null

    /**
     * Seats added during the current billing cycle.
     */
    public var addedThisCycle: Int? = null

    /**
     * The number of seats that have not used Copilot during the current billing cycle.
     */
    public var inactiveThisCycle: Int? = null

    /**
     * The number of seats that are pending cancellation at the end of the current billing cycle.
     */
    public var pendingCancellation: Int? = null

    /**
     * The number of users who have been invited to receive a Copilot seat through this organization.
     */
    public var pendingInvitation: Int? = null

    /**
     * The total number of seats being billed for the organization as of the current billing cycle.
     */
    public var total: Int? = null

    public fun build(): CopilotOrganizationSeatBreakdown = CopilotOrganizationSeatBreakdown(
      activeThisCycle = activeThisCycle,
      addedThisCycle = addedThisCycle,
      inactiveThisCycle = inactiveThisCycle,
      pendingCancellation = pendingCancellation,
      pendingInvitation = pendingInvitation,
      total = total,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): CopilotOrganizationSeatBreakdown = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<CopilotOrganizationSeatBreakdown> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): CopilotOrganizationSeatBreakdown {
      val jsonDecoder = decoder.requireJsonDecoder("CopilotOrganizationSeatBreakdown")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("CopilotOrganizationSeatBreakdown must be a JSON object")
      return CopilotOrganizationSeatBreakdown(
        activeThisCycle = rawObject["active_this_cycle"]?.let { json.decodeFromJsonElement<Int>(it) },
        addedThisCycle = rawObject["added_this_cycle"]?.let { json.decodeFromJsonElement<Int>(it) },
        inactiveThisCycle = rawObject["inactive_this_cycle"]?.let { json.decodeFromJsonElement<Int>(it) },
        pendingCancellation = rawObject["pending_cancellation"]?.let { json.decodeFromJsonElement<Int>(it) },
        pendingInvitation = rawObject["pending_invitation"]?.let { json.decodeFromJsonElement<Int>(it) },
        total = rawObject["total"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: CopilotOrganizationSeatBreakdown) {
      val jsonEncoder = encoder.requireJsonEncoder("CopilotOrganizationSeatBreakdown")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.activeThisCycle?.let { put("active_this_cycle", json.encodeToJsonElement(it)) }
        value.addedThisCycle?.let { put("added_this_cycle", json.encodeToJsonElement(it)) }
        value.inactiveThisCycle?.let { put("inactive_this_cycle", json.encodeToJsonElement(it)) }
        value.pendingCancellation?.let { put("pending_cancellation", json.encodeToJsonElement(it)) }
        value.pendingInvitation?.let { put("pending_invitation", json.encodeToJsonElement(it)) }
        value.total?.let { put("total", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun copilotOrganizationSeatBreakdown(block: CopilotOrganizationSeatBreakdown.Builder.() -> Unit): CopilotOrganizationSeatBreakdown = CopilotOrganizationSeatBreakdown.build(block)
