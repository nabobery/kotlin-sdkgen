package com.nabobery.sdkgen.github.generated

import kotlin.Int
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
 * The type of issue.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/issue-type-webhook
 */
@Serializable(with = IssueTypeWebhook.Serializer::class)
public class IssueTypeWebhook(
  /**
   * The unique identifier of the issue type.
   */
  public val id: Int,
  /**
   * The name of the issue type.
   */
  public val name: String,
  /**
   * The color of the issue type.
   */
  public val color: InlineIssueTypeWebhookColorXee50ed8e? = null,
) {
  public class Builder {
    private var idValue: Int? = null

    public var id: Int
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    /**
     * The color of the issue type.
     */
    public var color: InlineIssueTypeWebhookColorXee50ed8e? = null

    public fun build(): IssueTypeWebhook {
      check(idValue != null) { "id is required" }
      check(nameValue != null) { "name is required" }
      return IssueTypeWebhook(
        id = id,
        name = name,
        color = color,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): IssueTypeWebhook = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<IssueTypeWebhook> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): IssueTypeWebhook {
      val jsonDecoder = decoder.requireJsonDecoder("IssueTypeWebhook")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("IssueTypeWebhook must be a JSON object")
      val id = json.decodeRequired<Int>(rawObject, "id")
      val name = json.decodeRequired<String>(rawObject, "name")
      return IssueTypeWebhook(
        id = id,
        name = name,
        color = rawObject["color"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineIssueTypeWebhookColorXee50ed8e?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: IssueTypeWebhook) {
      val jsonEncoder = encoder.requireJsonEncoder("IssueTypeWebhook")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("id", json.encodeToJsonElement(value.id))
        put("name", value.name)
        value.color?.let { put("color", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun issueTypeWebhook(block: IssueTypeWebhook.Builder.() -> Unit): IssueTypeWebhook = IssueTypeWebhook.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("IssueTypeWebhook is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
