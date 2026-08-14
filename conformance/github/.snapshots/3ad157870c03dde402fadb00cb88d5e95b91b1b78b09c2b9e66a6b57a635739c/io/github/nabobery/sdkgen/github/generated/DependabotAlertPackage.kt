package io.github.nabobery.sdkgen.github.generated

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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.put

/**
 * Details for the vulnerable package.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/dependabot-alert-package
 */
@Serializable(with = DependabotAlertPackage.Serializer::class)
public class DependabotAlertPackage(
  /**
   * The package's language or package management ecosystem.
   */
  public val ecosystem: String,
  /**
   * The unique package name within its ecosystem.
   */
  public val name: String,
) {
  public class Builder {
    private var ecosystemValue: String? = null

    public var ecosystem: String
      get() = requireNotNull(ecosystemValue) { "ecosystem is required" }
      set(`value`) {
        ecosystemValue = value
      }

    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    public fun build(): DependabotAlertPackage {
      check(ecosystemValue != null) { "ecosystem is required" }
      check(nameValue != null) { "name is required" }
      return DependabotAlertPackage(
        ecosystem = ecosystem,
        name = name,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): DependabotAlertPackage = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<DependabotAlertPackage> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): DependabotAlertPackage {
      val jsonDecoder = decoder.requireJsonDecoder("DependabotAlertPackage")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("DependabotAlertPackage must be a JSON object")
      val ecosystem = json.decodeRequired<String>(rawObject, "ecosystem")
      val name = json.decodeRequired<String>(rawObject, "name")
      return DependabotAlertPackage(
        ecosystem = ecosystem,
        name = name,
      )
    }

    override fun serialize(encoder: Encoder, `value`: DependabotAlertPackage) {
      val jsonEncoder = encoder.requireJsonEncoder("DependabotAlertPackage")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("ecosystem", value.ecosystem)
        put("name", value.name)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun dependabotAlertPackage(block: DependabotAlertPackage.Builder.() -> Unit): DependabotAlertPackage = DependabotAlertPackage.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("DependabotAlertPackage is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
