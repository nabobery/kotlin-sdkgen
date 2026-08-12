package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

@Serializable
public data class TaxCodeView(
  public val description: String,
  public val id: String,
  public val name: String,
  @SerialName("object")
  public val objectValue: InlineTaxCodeObjectValueXd9620388,
)

/**
 * [Tax codes](https://stripe.com/docs/tax/tax-categories) classify goods and services for tax purposes.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/tax_code
 */
@Serializable(with = TaxCode.Serializer::class)
public class TaxCode(
  /**
   * A detailed description of which types of products the tax code represents.
   */
  public val description: String,
  /**
   * Unique identifier for the object.
   */
  public val id: String,
  /**
   * A short name for the tax code.
   */
  public val name: String,
  /**
   * String representing the object's type. Objects of the same type share the same value.
   */
  public val objectValue: InlineTaxCodeObjectValueXd9620388,
) {
  public class Builder {
    private var descriptionValue: String? = null

    public var description: String
      get() = requireNotNull(descriptionValue) { "description is required" }
      set(`value`) {
        descriptionValue = value
      }

    private var idValue: String? = null

    public var id: String
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

    private var objectValueValue: InlineTaxCodeObjectValueXd9620388? = null

    public var objectValue: InlineTaxCodeObjectValueXd9620388
      get() = requireNotNull(objectValueValue) { "objectValue is required" }
      set(`value`) {
        objectValueValue = value
      }

    public fun build(): TaxCode {
      check(descriptionValue != null) { "description is required" }
      check(idValue != null) { "id is required" }
      check(nameValue != null) { "name is required" }
      check(objectValueValue != null) { "objectValue is required" }
      return TaxCode(
        description = description,
        id = id,
        name = name,
        objectValue = objectValue,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): TaxCode = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<TaxCode> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): TaxCode {
      val jsonDecoder = decoder.requireJsonDecoder("TaxCode")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("TaxCode must be a JSON object")
      val description = json.decodeRequired<String>(rawObject, "description")
      val id = json.decodeRequired<String>(rawObject, "id")
      val name = json.decodeRequired<String>(rawObject, "name")
      val objectValue = json.decodeRequired<InlineTaxCodeObjectValueXd9620388>(rawObject, "object")
      return TaxCode(
        description = description,
        id = id,
        name = name,
        objectValue = objectValue,
      )
    }

    override fun serialize(encoder: Encoder, `value`: TaxCode) {
      val jsonEncoder = encoder.requireJsonEncoder("TaxCode")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("description", value.description)
        put("id", value.id)
        put("name", value.name)
        put("object", json.encodeToJsonElement(value.objectValue))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun taxCode(block: TaxCode.Builder.() -> Unit): TaxCode = TaxCode.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("TaxCode is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
