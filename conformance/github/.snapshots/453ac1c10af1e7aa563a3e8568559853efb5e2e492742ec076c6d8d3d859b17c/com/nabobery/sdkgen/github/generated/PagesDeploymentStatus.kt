package com.nabobery.sdkgen.github.generated

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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/pages-deployment-status.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/pages-deployment-status
 */
@Serializable(with = PagesDeploymentStatus.Serializer::class)
public class PagesDeploymentStatus(
  /**
   * The current status of the deployment.
   */
  public val status: InlinePagesDeploymentStatusStatusX4ddfcfd8? = null,
) {
  public class Builder {
    /**
     * The current status of the deployment.
     */
    public var status: InlinePagesDeploymentStatusStatusX4ddfcfd8? = null

    public fun build(): PagesDeploymentStatus = PagesDeploymentStatus(
      status = status,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PagesDeploymentStatus = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<PagesDeploymentStatus> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PagesDeploymentStatus {
      val jsonDecoder = decoder.requireJsonDecoder("PagesDeploymentStatus")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PagesDeploymentStatus must be a JSON object")
      return PagesDeploymentStatus(
        status = rawObject["status"]?.let { json.decodeFromJsonElement<InlinePagesDeploymentStatusStatusX4ddfcfd8>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PagesDeploymentStatus) {
      val jsonEncoder = encoder.requireJsonEncoder("PagesDeploymentStatus")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.status?.let { put("status", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun pagesDeploymentStatus(block: PagesDeploymentStatus.Builder.() -> Unit): PagesDeploymentStatus = PagesDeploymentStatus.build(block)
