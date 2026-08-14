package io.github.nabobery.sdkgen.github.generated

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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/issue-field/properties/options/items.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/issue-field/properties/options/items
 */
@Serializable(with = InlineIssueFieldOptionsItemX25d2beb7.Serializer::class)
public class InlineIssueFieldOptionsItemX25d2beb7(
  /**
   * The unique identifier of the option.
   */
  public val id: Int,
  /**
   * The name of the option.
   */
  public val name: String,
  /**
   * The color of the option.
   */
  public val color: InlineIssueFieldOptionsItemColorX0dcb6242? = null,
  /**
   * The time the option was created.
   *
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val createdAt: String? = null,
  /**
   * The description of the option.
   */
  public val description: String? = null,
  /**
   * The priority of the option for ordering.
   */
  public val priority: Int? = null,
  /**
   * The time the option was last updated.
   *
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val updatedAt: String? = null,
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
     * The color of the option.
     */
    public var color: InlineIssueFieldOptionsItemColorX0dcb6242? = null

    /**
     * The time the option was created.
     *
     * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var createdAt: String? = null

    /**
     * The description of the option.
     */
    public var description: String? = null

    /**
     * The priority of the option for ordering.
     */
    public var priority: Int? = null

    /**
     * The time the option was last updated.
     *
     * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var updatedAt: String? = null

    public fun build(): InlineIssueFieldOptionsItemX25d2beb7 {
      check(idValue != null) { "id is required" }
      check(nameValue != null) { "name is required" }
      return InlineIssueFieldOptionsItemX25d2beb7(
        id = id,
        name = name,
        color = color,
        createdAt = createdAt,
        description = description,
        priority = priority,
        updatedAt = updatedAt,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineIssueFieldOptionsItemX25d2beb7 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineIssueFieldOptionsItemX25d2beb7> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineIssueFieldOptionsItemX25d2beb7 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineIssueFieldOptionsItemX25d2beb7")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineIssueFieldOptionsItemX25d2beb7 must be a JSON object")
      val id = json.decodeRequired<Int>(rawObject, "id")
      val name = json.decodeRequired<String>(rawObject, "name")
      return InlineIssueFieldOptionsItemX25d2beb7(
        id = id,
        name = name,
        color = rawObject["color"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineIssueFieldOptionsItemColorX0dcb6242?>(element) },
        createdAt = rawObject["created_at"]?.let { json.decodeFromJsonElement<String>(it) },
        description = rawObject["description"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        priority = rawObject["priority"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        updatedAt = rawObject["updated_at"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineIssueFieldOptionsItemX25d2beb7) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineIssueFieldOptionsItemX25d2beb7")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("id", json.encodeToJsonElement(value.id))
        put("name", value.name)
        value.color?.let { put("color", json.encodeToJsonElement(it)) }
        value.createdAt?.let { put("created_at", it) }
        value.description?.let { put("description", it) }
        value.priority?.let { put("priority", json.encodeToJsonElement(it)) }
        value.updatedAt?.let { put("updated_at", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineIssueFieldOptionsItemX25d2beb7(block: InlineIssueFieldOptionsItemX25d2beb7.Builder.() -> Unit): InlineIssueFieldOptionsItemX25d2beb7 = InlineIssueFieldOptionsItemX25d2beb7.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineIssueFieldOptionsItemX25d2beb7 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
