package com.nabobery.sdkgen.generated

import kotlin.Double
import kotlin.String
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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/RouterParams.
 */
@Serializable(with = RouterParams.Serializer::class)
public class RouterParams(
  public val qualityFloor: Double? = null,
  public val throughputFloor: Double? = null,
  public val versionGroup: String? = null,
) {
  public class Builder {
    public var qualityFloor: Double? = null

    public var throughputFloor: Double? = null

    public var versionGroup: String? = null

    public fun build(): RouterParams = RouterParams(
      qualityFloor = qualityFloor,
      throughputFloor = throughputFloor,
      versionGroup = versionGroup,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): RouterParams = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<RouterParams> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): RouterParams {
      val jsonDecoder = decoder.requireJsonDecoder("RouterParams")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("RouterParams must be a JSON object")
      return RouterParams(
        qualityFloor = raw["quality_floor"]?.let { json.decodeFromJsonElement<Double>(it) },
        throughputFloor = raw["throughput_floor"]?.let { json.decodeFromJsonElement<Double>(it) },
        versionGroup = raw["version_group"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: RouterParams) {
      val jsonEncoder = encoder.requireJsonEncoder("RouterParams")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.qualityFloor?.let { put("quality_floor", json.encodeToJsonElement(it)) }
        value.throughputFloor?.let { put("throughput_floor", json.encodeToJsonElement(it)) }
        value.versionGroup?.let { put("version_group", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun routerParams(block: RouterParams.Builder.() -> Unit): RouterParams = RouterParams.build(block)
