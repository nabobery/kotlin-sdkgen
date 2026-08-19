package com.nabobery.sdkgen.generated

import kotlin.Int
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
public data class ComputerUseServerToolView(
  @SerialName("display_height")
  public val displayHeight: Int,
  @SerialName("display_width")
  public val displayWidth: Int,
  public val environment: InlineComputerUseServerToolEnvironmentXb519cc33,
  public val type: InlineComputerUseServerToolTypeXd55af592,
)

/**
 * Computer use preview tool configuration
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ComputerUseServerTool
 */
@Serializable(with = ComputerUseServerTool.Serializer::class)
public class ComputerUseServerTool(
  public val displayHeight: Int,
  public val displayWidth: Int,
  public val environment: InlineComputerUseServerToolEnvironmentXb519cc33,
  public val type: InlineComputerUseServerToolTypeXd55af592,
) {
  public class Builder {
    private var displayHeightValue: Int? = null

    public var displayHeight: Int
      get() = requireNotNull(displayHeightValue) { "displayHeight is required" }
      set(`value`) {
        displayHeightValue = value
      }

    private var displayWidthValue: Int? = null

    public var displayWidth: Int
      get() = requireNotNull(displayWidthValue) { "displayWidth is required" }
      set(`value`) {
        displayWidthValue = value
      }

    private var environmentValue: InlineComputerUseServerToolEnvironmentXb519cc33? = null

    public var environment: InlineComputerUseServerToolEnvironmentXb519cc33
      get() = requireNotNull(environmentValue) { "environment is required" }
      set(`value`) {
        environmentValue = value
      }

    private var typeValue: InlineComputerUseServerToolTypeXd55af592? = null

    public var type: InlineComputerUseServerToolTypeXd55af592
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): ComputerUseServerTool {
      check(displayHeightValue != null) { "displayHeight is required" }
      check(displayWidthValue != null) { "displayWidth is required" }
      check(environmentValue != null) { "environment is required" }
      check(typeValue != null) { "type is required" }
      return ComputerUseServerTool(
        displayHeight = displayHeight,
        displayWidth = displayWidth,
        environment = environment,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ComputerUseServerTool = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<ComputerUseServerTool> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ComputerUseServerTool {
      val jsonDecoder = decoder.requireJsonDecoder("ComputerUseServerTool")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ComputerUseServerTool must be a JSON object")
      val displayHeight = json.decodeRequired<Int>(rawObject, "display_height")
      val displayWidth = json.decodeRequired<Int>(rawObject, "display_width")
      val environment = json.decodeRequired<InlineComputerUseServerToolEnvironmentXb519cc33>(rawObject, "environment")
      val type = json.decodeRequired<InlineComputerUseServerToolTypeXd55af592>(rawObject, "type")
      return ComputerUseServerTool(
        displayHeight = displayHeight,
        displayWidth = displayWidth,
        environment = environment,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: ComputerUseServerTool) {
      val jsonEncoder = encoder.requireJsonEncoder("ComputerUseServerTool")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("display_height", json.encodeToJsonElement(value.displayHeight))
        put("display_width", json.encodeToJsonElement(value.displayWidth))
        put("environment", json.encodeToJsonElement(value.environment))
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun computerUseServerTool(block: ComputerUseServerTool.Builder.() -> Unit): ComputerUseServerTool = ComputerUseServerTool.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ComputerUseServerTool is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
