package com.nabobery.sdkgen.generated

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
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * User response to an MCP tool approval request
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/McpApprovalResponseItem
 */
@Serializable(with = McpApprovalResponseItem.Serializer::class)
public class McpApprovalResponseItem(
  public val approvalRequestId: String,
  public val approve: Boolean,
  public val type: InlineMcpApprovalResponseItemTypeX11d2becb,
  public val id: String? = null,
  public val reason: String? = null,
) {
  public class Builder {
    private var approvalRequestIdValue: String? = null

    public var approvalRequestId: String
      get() = requireNotNull(approvalRequestIdValue) { "approvalRequestId is required" }
      set(`value`) {
        approvalRequestIdValue = value
      }

    private var approveValue: Boolean? = null

    public var approve: Boolean
      get() = requireNotNull(approveValue) { "approve is required" }
      set(`value`) {
        approveValue = value
      }

    private var typeValue: InlineMcpApprovalResponseItemTypeX11d2becb? = null

    public var type: InlineMcpApprovalResponseItemTypeX11d2becb
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var id: String? = null

    public var reason: String? = null

    public fun build(): McpApprovalResponseItem {
      check(approvalRequestIdValue != null) { "approvalRequestId is required" }
      check(approveValue != null) { "approve is required" }
      check(typeValue != null) { "type is required" }
      return McpApprovalResponseItem(
        approvalRequestId = approvalRequestId,
        approve = approve,
        type = type,
        id = id,
        reason = reason,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): McpApprovalResponseItem = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<McpApprovalResponseItem> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): McpApprovalResponseItem {
      val jsonDecoder = decoder.requireJsonDecoder("McpApprovalResponseItem")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("McpApprovalResponseItem must be a JSON object")
      val approvalRequestId = json.decodeRequired<String>(rawObject, "approval_request_id")
      val approve = json.decodeRequired<Boolean>(rawObject, "approve")
      val type = json.decodeRequired<InlineMcpApprovalResponseItemTypeX11d2becb>(rawObject, "type")
      return McpApprovalResponseItem(
        approvalRequestId = approvalRequestId,
        approve = approve,
        type = type,
        id = rawObject["id"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        reason = rawObject["reason"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: McpApprovalResponseItem) {
      val jsonEncoder = encoder.requireJsonEncoder("McpApprovalResponseItem")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("approval_request_id", value.approvalRequestId)
        put("approve", json.encodeToJsonElement(value.approve))
        put("type", json.encodeToJsonElement(value.type))
        value.id?.let { put("id", it) }
        value.reason?.let { put("reason", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun mcpApprovalResponseItem(block: McpApprovalResponseItem.Builder.() -> Unit): McpApprovalResponseItem = McpApprovalResponseItem.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("McpApprovalResponseItem is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
