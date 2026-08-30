package com.nabobery.sdkgen.generated.stripe

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
 * Generated model for sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1persons/get/parameters/4/schema.
 *
 * Source: sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1persons/get/parameters/4/schema
 */
@Serializable(with = InlineV1AccountsPersonsGetParameterX9889ba8f.Serializer::class)
public class InlineV1AccountsPersonsGetParameterX9889ba8f(
  public val authorizer: Boolean? = null,
  public val director: Boolean? = null,
  public val executive: Boolean? = null,
  public val legalGuardian: Boolean? = null,
  public val owner: Boolean? = null,
  public val representative: Boolean? = null,
) {
  public class Builder {
    public var authorizer: Boolean? = null

    public var director: Boolean? = null

    public var executive: Boolean? = null

    public var legalGuardian: Boolean? = null

    public var owner: Boolean? = null

    public var representative: Boolean? = null

    public fun build(): InlineV1AccountsPersonsGetParameterX9889ba8f = InlineV1AccountsPersonsGetParameterX9889ba8f(
      authorizer = authorizer,
      director = director,
      executive = executive,
      legalGuardian = legalGuardian,
      owner = owner,
      representative = representative,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1AccountsPersonsGetParameterX9889ba8f = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1AccountsPersonsGetParameterX9889ba8f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1AccountsPersonsGetParameterX9889ba8f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountsPersonsGetParameterX9889ba8f")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1AccountsPersonsGetParameterX9889ba8f must be a JSON object")
      return InlineV1AccountsPersonsGetParameterX9889ba8f(
        authorizer = rawObject["authorizer"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        director = rawObject["director"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        executive = rawObject["executive"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        legalGuardian = rawObject["legal_guardian"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        owner = rawObject["owner"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        representative = rawObject["representative"]?.let { json.decodeFromJsonElement<Boolean>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsPersonsGetParameterX9889ba8f) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1AccountsPersonsGetParameterX9889ba8f")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.authorizer?.let { put("authorizer", json.encodeToJsonElement(it)) }
        value.director?.let { put("director", json.encodeToJsonElement(it)) }
        value.executive?.let { put("executive", json.encodeToJsonElement(it)) }
        value.legalGuardian?.let { put("legal_guardian", json.encodeToJsonElement(it)) }
        value.owner?.let { put("owner", json.encodeToJsonElement(it)) }
        value.representative?.let { put("representative", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1AccountsPersonsGetParameterX9889ba8f(block: InlineV1AccountsPersonsGetParameterX9889ba8f.Builder.() -> Unit): InlineV1AccountsPersonsGetParameterX9889ba8f = InlineV1AccountsPersonsGetParameterX9889ba8f.build(block)
