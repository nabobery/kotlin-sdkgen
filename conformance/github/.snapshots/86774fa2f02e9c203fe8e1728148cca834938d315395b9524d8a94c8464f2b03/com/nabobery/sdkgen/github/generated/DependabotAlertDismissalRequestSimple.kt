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
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Information about an active dismissal request for this Dependabot alert.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/dependabot-alert-dismissal-request-simple
 */
@Serializable(with = DependabotAlertDismissalRequestSimple.Serializer::class)
public class DependabotAlertDismissalRequestSimple(
  /**
   * The date and time when the dismissal request was created.
   *
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val createdAt: String? = null,
  /**
   * The unique identifier of the dismissal request.
   */
  public val id: Int? = null,
  /**
   * The user who requested the dismissal.
   */
  public val requester: InlineDependabotAlertDismissalRequestSimpleRequesterX398b2b84? = null,
  /**
   * The current status of the dismissal request.
   */
  public val status: InlineDependabotAlertDismissalRequestSimpleStatusXf97bfc7c? = null,
  /**
   * The API URL to get more information about this dismissal request.
   *
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val url: String? = null,
) {
  public class Builder {
    /**
     * The date and time when the dismissal request was created.
     *
     * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var createdAt: String? = null

    /**
     * The unique identifier of the dismissal request.
     */
    public var id: Int? = null

    /**
     * The user who requested the dismissal.
     */
    public var requester: InlineDependabotAlertDismissalRequestSimpleRequesterX398b2b84? = null

    /**
     * The current status of the dismissal request.
     */
    public var status: InlineDependabotAlertDismissalRequestSimpleStatusXf97bfc7c? = null

    /**
     * The API URL to get more information about this dismissal request.
     *
     * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var url: String? = null

    public fun build(): DependabotAlertDismissalRequestSimple = DependabotAlertDismissalRequestSimple(
      createdAt = createdAt,
      id = id,
      requester = requester,
      status = status,
      url = url,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): DependabotAlertDismissalRequestSimple = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<DependabotAlertDismissalRequestSimple> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): DependabotAlertDismissalRequestSimple {
      val jsonDecoder = decoder.requireJsonDecoder("DependabotAlertDismissalRequestSimple")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("DependabotAlertDismissalRequestSimple must be a JSON object")
      return DependabotAlertDismissalRequestSimple(
        createdAt = rawObject["created_at"]?.let { json.decodeFromJsonElement<String>(it) },
        id = rawObject["id"]?.let { json.decodeFromJsonElement<Int>(it) },
        requester = rawObject["requester"]?.let { json.decodeFromJsonElement<InlineDependabotAlertDismissalRequestSimpleRequesterX398b2b84>(it) },
        status = rawObject["status"]?.let { json.decodeFromJsonElement<InlineDependabotAlertDismissalRequestSimpleStatusXf97bfc7c>(it) },
        url = rawObject["url"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: DependabotAlertDismissalRequestSimple) {
      val jsonEncoder = encoder.requireJsonEncoder("DependabotAlertDismissalRequestSimple")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.createdAt?.let { put("created_at", it) }
        value.id?.let { put("id", json.encodeToJsonElement(it)) }
        value.requester?.let { put("requester", json.encodeToJsonElement(it)) }
        value.status?.let { put("status", json.encodeToJsonElement(it)) }
        value.url?.let { put("url", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun dependabotAlertDismissalRequestSimple(block: DependabotAlertDismissalRequestSimple.Builder.() -> Unit): DependabotAlertDismissalRequestSimple = DependabotAlertDismissalRequestSimple.build(block)
