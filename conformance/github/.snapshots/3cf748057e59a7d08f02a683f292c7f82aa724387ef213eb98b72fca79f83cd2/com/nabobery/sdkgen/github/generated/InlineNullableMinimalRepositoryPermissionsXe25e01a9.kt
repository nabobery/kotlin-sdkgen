package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
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
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/nullable-minimal-repository/properties/permissions.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/nullable-minimal-repository/properties/permissions
 */
@Serializable(with = InlineNullableMinimalRepositoryPermissionsXe25e01a9.Serializer::class)
public class InlineNullableMinimalRepositoryPermissionsXe25e01a9(
  public val admin: Boolean? = null,
  public val maintain: Boolean? = null,
  public val pull: Boolean? = null,
  public val push: Boolean? = null,
  public val triage: Boolean? = null,
) {
  public class Builder {
    public var admin: Boolean? = null

    public var maintain: Boolean? = null

    public var pull: Boolean? = null

    public var push: Boolean? = null

    public var triage: Boolean? = null

    public fun build(): InlineNullableMinimalRepositoryPermissionsXe25e01a9 = InlineNullableMinimalRepositoryPermissionsXe25e01a9(
      admin = admin,
      maintain = maintain,
      pull = pull,
      push = push,
      triage = triage,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineNullableMinimalRepositoryPermissionsXe25e01a9 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineNullableMinimalRepositoryPermissionsXe25e01a9> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineNullableMinimalRepositoryPermissionsXe25e01a9 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineNullableMinimalRepositoryPermissionsXe25e01a9")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineNullableMinimalRepositoryPermissionsXe25e01a9 must be a JSON object")
      return InlineNullableMinimalRepositoryPermissionsXe25e01a9(
        admin = rawObject["admin"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        maintain = rawObject["maintain"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        pull = rawObject["pull"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        push = rawObject["push"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        triage = rawObject["triage"]?.let { json.decodeFromJsonElement<Boolean>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineNullableMinimalRepositoryPermissionsXe25e01a9) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineNullableMinimalRepositoryPermissionsXe25e01a9")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.admin?.let { put("admin", json.encodeToJsonElement(it)) }
        value.maintain?.let { put("maintain", json.encodeToJsonElement(it)) }
        value.pull?.let { put("pull", json.encodeToJsonElement(it)) }
        value.push?.let { put("push", json.encodeToJsonElement(it)) }
        value.triage?.let { put("triage", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineNullableMinimalRepositoryPermissionsXe25e01a9(block: InlineNullableMinimalRepositoryPermissionsXe25e01a9.Builder.() -> Unit): InlineNullableMinimalRepositoryPermissionsXe25e01a9 = InlineNullableMinimalRepositoryPermissionsXe25e01a9.build(block)
